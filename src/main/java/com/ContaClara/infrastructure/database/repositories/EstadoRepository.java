package com.ContaClara.infrastructure.database.repositories;

import com.ContaClara.core.domain.entities.Eletrodomestico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Eletrodomestico, Long> {
}
