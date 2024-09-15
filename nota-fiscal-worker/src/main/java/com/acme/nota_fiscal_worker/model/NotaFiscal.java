package com.acme.nota_fiscal_worker.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor@AllArgsConstructor@Builder
public class NotaFiscal {
    private Long id;
    private String catalogoId;
}
