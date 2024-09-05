package com.acme.catalogo.service.impl;

import com.acme.catalogo.model.Catalogo;
import com.acme.catalogo.repository.CatalogoRepository;
import com.acme.catalogo.service.CatalogoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CatalogoServiceImpl implements CatalogoService {
    private final CatalogoRepository catalogoRepository;

    @Override
    public Catalogo create(Catalogo catalogo) {
        return catalogoRepository.save(catalogo);
    }

    @Override
    public Optional<Catalogo> findById(Long id) {
        return catalogoRepository.findById(id);
    }

    @Override
    public List<Catalogo> findAll() {
        return catalogoRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        catalogoRepository.deleteById(id);
    }

    @Override
    public Catalogo update(Catalogo catalogo) {
        return catalogoRepository.save(catalogo);
    }
}
