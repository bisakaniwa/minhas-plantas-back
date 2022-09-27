package com.minhasplantas.services;

import com.minhasplantas.classes.Suculenta;
import com.minhasplantas.repositories.SuculentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SuculentaService {

    @Autowired
    private SuculentaRepository repository;

    public Suculenta buscarPorId(Long id) throws ChangeSetPersister.NotFoundException {
        Optional<Suculenta> suculenta = this.repository.findById(id);
        if (suculenta.isPresent()) {
            return suculenta.get();
        } else {
            throw new ChangeSetPersister.NotFoundException();
        }
    }

    public Suculenta salvar(Suculenta suculenta) {
        Suculenta salvar = new Suculenta();
        salvar.setOrigem(suculenta.getOrigem());
        salvar.setGenero(suculenta.getGenero());
        salvar.setEspecie(suculenta.getEspecie());
        salvar.setEspecificacao(suculenta.getEspecificacao());
        salvar.setNomePopular(suculenta.getNomePopular());
        salvar.setImagens(suculenta.getImagens());
        salvar.setDetalhe(suculenta.getDetalhe());
        this.repository.save(salvar);
        return salvar;
    }
}
