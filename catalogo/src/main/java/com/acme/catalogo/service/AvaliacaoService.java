package com.acme.catalogo.service;

import com.acme.catalogo.client.AvaliacaoClient;
import com.acme.catalogo.model.Avaliacao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliacaoService {
    private final AvaliacaoClient avaliacaoClient;

    public List<Avaliacao> getAllById(Long catalogoId) {
        return avaliacaoClient.getById(catalogoId);
    }
}
