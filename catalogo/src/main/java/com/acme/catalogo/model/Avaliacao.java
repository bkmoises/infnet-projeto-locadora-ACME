package com.acme.catalogo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Avaliacao {
    private long id;
    private long catalogoId;
    private BigDecimal nota;
    private String comentario;
}
