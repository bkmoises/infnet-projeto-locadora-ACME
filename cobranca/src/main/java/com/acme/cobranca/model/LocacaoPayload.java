package com.acme.cobranca.model;

import java.util.List;

public record LocacaoPayload(List<Pedido> pedidos) {
}
