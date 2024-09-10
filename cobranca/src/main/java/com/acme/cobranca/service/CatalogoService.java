package com.acme.cobranca.service;

import com.acme.cobranca.client.CatalogoClient;
import com.acme.cobranca.model.Catalogo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CatalogoService {
    private final CatalogoClient catalogoClient;

    public Catalogo getById(Long id) {
        return catalogoClient.catalogoById(id);
    }
}
