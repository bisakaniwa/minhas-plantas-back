package com.minhasplantas.repositories;

import com.minhasplantas.classes.Suculenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuculentaRepository extends JpaRepository<Suculenta, Long> {


}
