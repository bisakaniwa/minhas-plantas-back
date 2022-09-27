package com.minhasplantas.controllers;

import com.minhasplantas.classes.Suculenta;
import com.minhasplantas.services.SuculentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/suculentas")
@RestController
@CrossOrigin
public class SuculentaController {

    @Autowired
    private SuculentaService service;

    @GetMapping("/{id}")
    ResponseEntity<Suculenta> buscarPorId(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    ResponseEntity<Suculenta> salvar(@RequestBody Suculenta suculenta) {
        return new ResponseEntity<>(this.service.salvar(suculenta), HttpStatus.CREATED);
    }
}
