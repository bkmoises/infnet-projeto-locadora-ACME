package com.acme.locacao.controller;

import com.acme.locacao.model.Locacao;
import com.acme.locacao.service.LocacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class LocacaoController {
    private final LocacaoService locacaoService;

    @PostMapping
    public ResponseEntity create(@RequestBody Locacao locacao) {
        locacaoService.save(locacao);
        return null;
    }
}
