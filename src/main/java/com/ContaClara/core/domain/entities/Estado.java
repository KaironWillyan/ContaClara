package com.ContaClara.core.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String uf;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @OneToMany
    private List<Cidade> cidades;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @OneToMany
    private List<Usuario> usuarios;
}
