package com.acme.cobranca.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data@NoArgsConstructor@AllArgsConstructor@Builder
public class Pedido {
    private long catalogoId;
    private short dias;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;

    public long getDiasAtraso() {
        long periodoLocacao = ChronoUnit.DAYS.between(this.dataLocacao, this.dataDevolucao);
        long diasAtraso =  periodoLocacao - dias;

        return Math.max(diasAtraso, 0);
    }
}
