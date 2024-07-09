package com.ContaClara.core.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_ambiente")
public class Ambiente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double areaM2;
    private Integer qtdPessoas;

    @ManyToOne
    @JoinColumn(name = "fk_tb_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "ambiente")
    private List<Eletrodomestico> eletrodomesticos;
}
