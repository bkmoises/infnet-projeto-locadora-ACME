package com.acme.cobranca.service;

import com.acme.cobranca.model.Catalogo;
import com.acme.cobranca.model.LocacaoPayload;
import com.acme.cobranca.model.Pedido;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
@RequiredArgsConstructor
public class CobrancaService {
    @Value("${valorLocacao.valor}")
    private BigDecimal valorLocacao;

    @Value("${valorLocacao.lancamento}")
    private BigDecimal valorLocacaoLancamento;

    private final CatalogoService catalogoService;

    public BigDecimal calcularValorTotal(LocacaoPayload locacaoPayload) {
        return locacaoPayload.pedidos().stream()
                .map(this::calcularValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calcularValor(Pedido pedido) {
        Catalogo catalogo = catalogoService.getById(pedido.getCatalogoId());

        return getValor(catalogo.getLancamento(), pedido.getDias(), pedido.getDiasAtraso());
    }

    private BigDecimal getValor(Boolean isLancamento, short dias, long diasAtraso) {
        BigDecimal diaria = isLancamento ? valorLocacaoLancamento : valorLocacao;
        BigDecimal valorLocacao = BigDecimal.valueOf(dias).multiply(diaria);

        BigDecimal multa = diaria.divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(diasAtraso));

        return valorLocacao.add(multa);
    }

}