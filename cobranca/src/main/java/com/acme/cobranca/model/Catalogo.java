package com.acme.cobranca.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Catalogo {
    private Long id;
    private String titulo;
    private Short ano;
    private Boolean lancamento;
    private Boolean disponivel;
}
