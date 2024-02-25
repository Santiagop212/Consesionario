package com.api.consesionario.repository;

import com.api.consesionario.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
