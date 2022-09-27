package com.minhasplantas.services;

import com.minhasplantas.classes.SuculentasCuidados;
import com.minhasplantas.repositories.SuculentasCuidadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SuculentasCuidadosService {

    @Autowired
    private SuculentasCuidadosRepository repository;

    public SuculentasCuidados buscarPorId(Long id) throws ChangeSetPersister.NotFoundException {
        Optional<SuculentasCuidados> cuidados = this.repository.findById(id);
        if (cuidados.isPresent()) {
            return cuidados.get();
        } else {
            throw new ChangeSetPersister.NotFoundException();
        }
    }

    public SuculentasCuidados buscarPorSuculentaId(Long id) {
        SuculentasCuidados cuidado = new SuculentasCuidados();
        try {
            cuidado = this.repository.findBySuculentaId(id);
        } catch (Exception e) {}
        return cuidado;
    }
}
