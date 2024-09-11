package com.acme.avaliacao.controller;

import com.acme.avaliacao.model.Avaliacao;
import com.acme.avaliacao.service.AvaliacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class AvalicaoController {
    private final AvaliacaoService avaliacaoService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getAvaliacao(@PathVariable Long id) {
        List<Avaliacao> allByCatalogoId = avaliacaoService.findAllByCatalogoId(id);
        if(allByCatalogoId.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(allByCatalogoId);
    }
}
