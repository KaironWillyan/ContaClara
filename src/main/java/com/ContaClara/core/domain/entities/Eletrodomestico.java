package com.ContaClara.core.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_eletrodomestico")
public class Eletrodomestico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipo;
    private Integer potencia;
    private Integer quantidade;
    private Integer potenciaMediaW;
    private Integer horaFuncionamento;
    private Double totalMensal;

    @ManyToOne
    @JoinColumn(name = "fk_tb_ambiente")
    private Ambiente ambiente;
}
