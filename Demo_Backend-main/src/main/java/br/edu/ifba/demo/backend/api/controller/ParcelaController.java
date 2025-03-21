package br.edu.ifba.demo.backend.api.controller;

import br.edu.ifba.demo.backend.api.model.ParcelaModel;
import br.edu.ifba.demo.backend.api.repository.ParcelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/parcelas")
public class ParcelaController {

    @Autowired
    private ParcelaRepository parcelaRepository;

    @PostMapping
    public ResponseEntity<ParcelaModel> criarParcela(@RequestBody ParcelaModel parcela) {
        return ResponseEntity.ok(parcelaRepository.save(parcela));
    }

    @GetMapping
    public List<ParcelaModel> listarParcelas() {
        return parcelaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParcelaModel> buscarParcela(@PathVariable Long id) {
        return parcelaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarParcela(@PathVariable Long id) {
        if (!parcelaRepository.existsById(id)) return ResponseEntity.notFound().build();
        parcelaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}