package br.edu.ifba.demo.backend.api.controller;
import br.edu.ifba.demo.backend.api.model.TelefoneModel;
import br.edu.ifba.demo.backend.api.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/telefones")
public class TelefoneController {

    @Autowired
    private TelefoneRepository telefoneRepository;

    @PostMapping
    public ResponseEntity<TelefoneModel> criarTelefone(@RequestBody TelefoneModel telefone) {
        return ResponseEntity.ok(telefoneRepository.save(telefone));
    }

    @GetMapping
    public List<TelefoneModel> listarTelefones() {
        return telefoneRepository.findAll();
    }
}