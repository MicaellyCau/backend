package br.edu.ifba.demo.backend.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContaDTO {
    private Long id;
    private String descricao;
    private Double valor;
    private String dataVencimento;
    private String dataPagamento;
    private String tipoConta;
    private Boolean status;
    private Long categoriaId;
    private Long usuarioId;
}