package com.acme.cliente.service;

import com.acme.cliente.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    Cliente create(Cliente cliente);
    Optional<Cliente> findById(Long id);
    List<Cliente> findAll();
    void deleteById(Long id);
    Cliente update(Cliente cliente);
}
