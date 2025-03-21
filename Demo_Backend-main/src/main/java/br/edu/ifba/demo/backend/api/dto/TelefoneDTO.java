package br.edu.ifba.demo.backend.api.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TelefoneDTO {
    private Long id;
    private String ddd;
    private String numero;
    private String tipo;
}