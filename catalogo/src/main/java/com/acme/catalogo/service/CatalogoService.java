package com.acme.catalogo.service;

import com.acme.catalogo.model.Catalogo;

import java.util.List;
import java.util.Optional;

public interface CatalogoService {
    Catalogo create(Catalogo catalogo);
    Optional<Catalogo> findById(Long id);
    List<Catalogo> findAll();
    void deleteById(Long id);
    Catalogo update(Catalogo catalogo);
}
