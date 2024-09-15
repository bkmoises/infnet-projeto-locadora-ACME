package com.acme.locacao.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("NOTA-FISCAL-SERVICE")
public interface NotaFiscalClient {
    @GetMapping("/emitir/{catalogoId}")
    void emitir(@PathVariable String catalogoId);
}
