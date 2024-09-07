package com.acme.cobranca.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data@NoArgsConstructor@AllArgsConstructor@Builder
public class Titulo {
    private long catalogoId;
    private short dias;
    private LocalDate data;
}
