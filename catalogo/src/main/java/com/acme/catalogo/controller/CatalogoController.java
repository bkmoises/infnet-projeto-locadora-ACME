package com.acme.catalogo.controller;

import com.acme.catalogo.model.Catalogo;
import com.acme.catalogo.service.CatalogoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class CatalogoController {
    private final CatalogoService catalogoService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(catalogoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Catalogo> optionalCatalogo = catalogoService.findById(id);
        if (optionalCatalogo.isPresent()) {
            return ResponseEntity.ok(optionalCatalogo.get());
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        catalogoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Catalogo catalogo) {
        Catalogo saved = catalogoService.create(catalogo);
        return ResponseEntity.ok(saved);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Catalogo catalogo) {
        catalogoService.update(catalogo);
        return ResponseEntity.ok().build();
    }
}