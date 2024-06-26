package com.ContaClara.infrastructure.database.repositories;

import com.ContaClara.core.domain.entities.Endereco;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
