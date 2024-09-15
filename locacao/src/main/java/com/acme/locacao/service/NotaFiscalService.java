package com.acme.locacao.service;

import com.acme.locacao.client.NotaFiscalClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotaFiscalService {
    private final NotaFiscalClient notaFiscalClient;

    public void emitir(String catalogoId) {
        notaFiscalClient.emitir(catalogoId);
    }
}
