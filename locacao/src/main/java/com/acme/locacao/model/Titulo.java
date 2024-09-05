package com.acme.locacao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Titulo {
    private long catalogoId;
    private long quantidade;
    private short dias;
    private LocalDate data;
}
