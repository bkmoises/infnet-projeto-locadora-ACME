package com.acme.cobranca.service;

import com.acme.cobranca.model.Catalogo;
import com.acme.cobranca.model.LocacaoPayload;
import com.acme.cobranca.model.Titulo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CobrancaService {
    private final CatalogoService catalogoService;

    public BigDecimal calcularValorTotal(LocacaoPayload locacaoPayload) {
        return locacaoPayload.titulos().stream()
                .map(this::calcularValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calcularValor(Titulo titulo) {
        Catalogo catalogo = catalogoService.getById(titulo.getCatalogoId());
        return getValor(catalogo.getLancamento(), titulo.getDias());
    }

    private BigDecimal getValor(Boolean isLancamento, short dias) {
        BigDecimal diaria = BigDecimal.valueOf(isLancamento ? 6.00 : 3.00);
        return BigDecimal.valueOf(dias).multiply(diaria);
    };
}