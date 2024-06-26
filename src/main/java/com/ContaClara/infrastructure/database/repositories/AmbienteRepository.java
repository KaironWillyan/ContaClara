package com.ContaClara.infrastructure.database.repositories;

import com.ContaClara.core.domain.entities.Ambiente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmbienteRepository extends JpaRepository<Ambiente, Long> {
}
