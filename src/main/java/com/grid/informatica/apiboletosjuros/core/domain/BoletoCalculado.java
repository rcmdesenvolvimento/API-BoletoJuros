package com.grid.informatica.apiboletosjuros.core.domain;

import com.grid.informatica.apiboletosjuros.core.domain.enums.TipoBoleto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class BoletoCalculado {

    private String codigo;
    private BigDecimal valorOriginal;
    private BigDecimal valor;
    private LocalDateTime dataVencimento;
    private LocalDateTime dataPagamento;
    private BigDecimal juros;
    private TipoBoleto tipo;

}
