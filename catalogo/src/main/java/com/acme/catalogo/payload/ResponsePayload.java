package com.acme.catalogo.payload;

import com.acme.catalogo.model.Avaliacao;
import com.acme.catalogo.model.Catalogo;

import java.util.List;

public record ResponsePayload(Catalogo catalogo, List<Avaliacao> avaliacoes) {
}
