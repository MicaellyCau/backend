package br.edu.ifba.demo.backend.api.dto;

import lombok.Data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {
    private Long id;
    private String rua;
    private String cidade;
    private String numero;
    private String cep;
}
