package com.grid.informatica.apiboletosjuros.core.domain;

import com.grid.informatica.apiboletosjuros.core.domain.enums.TipoBoleto;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class Boleto {

    private String codigo;
    private LocalDateTime dataVencimento;
    private BigDecimal valor;
    private TipoBoleto tipo;
}
