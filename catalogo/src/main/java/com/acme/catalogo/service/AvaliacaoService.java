package com.acme.catalogo.service;

import com.acme.catalogo.client.AvaliacaoClient;
import com.acme.catalogo.model.Avaliacao;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@RequiredArgsConstructor
public class AvaliacaoService {
    private final AvaliacaoClient avaliacaoClient;
    private static Map<Long, List<Avaliacao>> CACHE = new ConcurrentHashMap<>();

    @CircuitBreaker(name = "avaliacaoService", fallbackMethod = "findOnCache")
    public List<Avaliacao> getAllById(Long catalogoId) {
        List<Avaliacao> avaliacoes = avaliacaoClient.getById(catalogoId);
        CACHE.put(catalogoId, avaliacoes);
        return avaliacoes;
    }

    private List<Avaliacao> findOnCache(Long catalogoId, Throwable throwable) {
        return CACHE.getOrDefault(catalogoId, new ArrayList<>());
    }


}
