package com.minhasplantas.controllers;

import com.minhasplantas.classes.SuculentasCuidados;
import com.minhasplantas.services.SuculentasCuidadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/suc-cuidados")
@RestController
public class SuculentasCuidadosController {

    @Autowired
    private SuculentasCuidadosService service;

    @GetMapping("/{id}")
    ResponseEntity<SuculentasCuidados> buscarPorId(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @GetMapping("/suculenta/{id}")
    ResponseEntity<SuculentasCuidados> buscarPorSuculentaId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorSuculentaId(id));
    }
}
