package com.acme.locacao.client;

import com.acme.locacao.model.CobrancaReponsePaylod;
import com.acme.locacao.model.Locacao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("COBRANCA-SERVICE")
public interface CobrancaClient {
    @PostMapping("/")
    CobrancaReponsePaylod cobranca(@RequestBody Locacao locacao);
}
