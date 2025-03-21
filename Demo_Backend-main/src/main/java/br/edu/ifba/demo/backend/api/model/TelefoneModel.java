package br.edu.ifba.demo.backend.api.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "telefone")

public class TelefoneModel {
    

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    
        private String ddd;
        private String numero;
        private String tipo;
    
        @ManyToOne
        @JoinColumn(name = "usuario_id")
        private UsuarioModel usuario;
    }
    

