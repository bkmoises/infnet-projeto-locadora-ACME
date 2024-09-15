package com.acme.cobranca.controller;

import com.acme.cobranca.model.LocacaoPayload;
import com.acme.cobranca.service.CobrancaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class CobrancaController {
    private final CobrancaService cobrancaService;

    @PostMapping
    public ResponseEntity<Map<String, BigDecimal>> calcularCusto(@RequestBody LocacaoPayload locacaoPayload) {
        BigDecimal cobranca = cobrancaService.calcularValorTotal(locacaoPayload);
        return ResponseEntity.ok(Map.of("valorTotal", cobranca));
    }
}
