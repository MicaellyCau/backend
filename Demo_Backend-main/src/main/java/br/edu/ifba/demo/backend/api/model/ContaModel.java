package br.edu.ifba.demo.backend.api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "conta")
public class ContaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta")
    private Long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "valor", nullable = false)
    private Float valor;

    @Column(name = "data_vencimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;

    @Column(name = "data_pagamento")
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;

    @Column(name = "tipo_conta", nullable = false)
    private String tipoConta;

    @Column(name = "status", nullable = false)
    private Boolean status;


    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaModel categoria;

    @OneToMany(mappedBy = "conta", cascade = CascadeType.ALL)
    private List<ParcelaModel> parcelas;

}
