package com.minhasplantas.repositories;

import com.minhasplantas.classes.SuculentasCuidados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuculentasCuidadosRepository extends JpaRepository {

    SuculentasCuidados findBySuculentaId(Long id);
}
