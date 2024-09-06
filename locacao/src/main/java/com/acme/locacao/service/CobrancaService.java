package com.acme.locacao.service;

import com.acme.locacao.model.Locacao;
import com.acme.locacao.model.CobrancaReponsePaylod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class CobrancaService {
    public CobrancaReponsePaylod getValorTotal(Locacao locacao) {
        var serverUrl = "http://localhost:8084";
        RestClient restClient = RestClient.create();
        return restClient.post()
                .uri(serverUrl)
                .body(locacao)
                .retrieve()
                .toEntity(CobrancaReponsePaylod.class).getBody();
    }
}
