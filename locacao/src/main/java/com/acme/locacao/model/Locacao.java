package com.acme.locacao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
@Document(collection = "locacoes")
public class Locacao {
    @Id
    private String id;
    private List<Titulo> titulos;
    private BigDecimal valorTotal;
}
