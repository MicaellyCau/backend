package br.edu.ifba.demo.backend.api.controller;
import br.edu.ifba.demo.backend.api.model.EnderecoModel;
import br.edu.ifba.demo.backend.api.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping
    public ResponseEntity<EnderecoModel> criarEndereco(@RequestBody EnderecoModel endereco) {
        return ResponseEntity.ok(enderecoRepository.save(endereco));
    }

    @GetMapping
    public List<EnderecoModel> listarEnderecos() {
        return enderecoRepository.findAll();
    }
}
