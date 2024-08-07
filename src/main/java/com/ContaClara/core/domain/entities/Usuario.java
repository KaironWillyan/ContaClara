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
@Table(name = "tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @ManyToOne
    @JoinColumn(name = "fk_tb_estado")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "fk_tb_cidade")
    private Cidade cidade;
}
