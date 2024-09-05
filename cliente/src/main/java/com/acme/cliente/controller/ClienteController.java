package com.acme.cliente.controller;

import com.acme.cliente.model.Cliente;
import com.acme.cliente.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ClienteController {
    private final ClienteService clienteService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(clienteService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Cliente> optionalCliente = clienteService.findById(id);
        if (optionalCliente.isPresent()) {
            return ResponseEntity.ok(optionalCliente.get());
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        clienteService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Cliente cliente) {
        Cliente saved = clienteService.create(cliente);
        return ResponseEntity.ok(saved);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Cliente cliente) {
        clienteService.update(cliente);
        return ResponseEntity.ok().build();
    }
}
