package br.edu.ifba.demo.backend.api.controller;

import br.edu.ifba.demo.backend.api.model.ContaModel;
import br.edu.ifba.demo.backend.api.repository.ContaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/conta")
public class ContaController {
    private final ContaRepository contaRepository;

    public ContaController(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @GetMapping("/listall")
    public List<ContaModel> listAll() {
        return contaRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<ContaModel> findById(@PathVariable Long id) {
        Optional<ContaModel> conta = contaRepository.findById(id);
        return conta.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ContaModel> addConta(@RequestBody ContaModel conta) {
        ContaModel savedConta = contaRepository.save(conta);
        return new ResponseEntity<>(savedConta, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConta(@PathVariable Long id) {
        if (contaRepository.existsById(id)) {
            contaRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}