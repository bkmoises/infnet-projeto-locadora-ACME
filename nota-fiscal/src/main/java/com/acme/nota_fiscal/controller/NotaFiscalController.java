package com.acme.nota_fiscal.controller;


import com.acme.nota_fiscal.model.NotaFiscal;
import com.acme.nota_fiscal.service.NotaFiscalService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Random;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class NotaFiscalController {
    private final NotaFiscalService notaFiscalService;

    @GetMapping("/emitir/{catalogoId}")
    public ResponseEntity<?> emitir(@PathVariable String catalogoId) {
        NotaFiscal notaFiscal = NotaFiscal.builder().catalogoId(catalogoId).id(new Random().nextLong()).build();
        try {
            NotaFiscal nota =  notaFiscalService.emitir(notaFiscal);
            return ResponseEntity.ok().body(nota);
        } catch (JsonProcessingException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/{notafiscalId")
    public ResponseEntity<?> getNotaFiscal(@PathVariable Long notafiscalId) {
        return ResponseEntity.ok(notaFiscalService.findById(notafiscalId));
    }
}
