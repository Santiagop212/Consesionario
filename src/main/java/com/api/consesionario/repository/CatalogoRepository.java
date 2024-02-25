package com.api.consesionario.repository;

import com.api.consesionario.model.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoRepository extends JpaRepository<Catalogo, Long> {
}
