package com.acme.locacao.service;

import com.acme.locacao.client.CobrancaClient;
import com.acme.locacao.model.Locacao;
import com.acme.locacao.model.CobrancaReponsePaylod;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class CobrancaService {
    private final CobrancaClient cobrancaClient;

    public CobrancaReponsePaylod getValorTotal(Locacao locacao) {
        return cobrancaClient.cobranca(locacao);
    }
}
