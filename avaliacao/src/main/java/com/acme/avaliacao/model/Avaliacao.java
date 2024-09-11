package com.acme.avaliacao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity
@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "catalogo_id")
    private long catalogoId;
    @DecimalMin(value = "0.5", message = "A nota mínima é 0.5")
    @DecimalMax(value = "5.0", message = "A nota máxima é 5.0")
    @Column(precision = 2, scale = 1)
    private BigDecimal nota;
    private String comentario;
}
