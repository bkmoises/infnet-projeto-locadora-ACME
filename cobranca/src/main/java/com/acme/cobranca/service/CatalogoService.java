package com.acme.cobranca.service;

import com.acme.cobranca.model.Catalogo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class CatalogoService {
    public Catalogo getById(Long id) {
        RestClient restClient = RestClient.create();
        var serverUrl = String.format("http://localhost:8081/%d", id);
        return restClient
                .get()
                .uri(serverUrl)
                .retrieve()
                .toEntity(Catalogo.class).getBody();
    }
}
