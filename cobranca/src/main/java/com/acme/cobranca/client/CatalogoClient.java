package com.acme.cobranca.client;

import com.acme.cobranca.model.Catalogo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("CATALOGO-SERVICE")
public interface CatalogoClient {
    @GetMapping("/{id}")
    Catalogo catalogoById(@PathVariable Long id);
}
