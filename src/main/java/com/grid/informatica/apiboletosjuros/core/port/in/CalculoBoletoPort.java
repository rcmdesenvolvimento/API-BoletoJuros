package com.grid.informatica.apiboletosjuros.core.port.in;

import com.grid.informatica.apiboletosjuros.core.domain.BoletoCalculado;

import java.time.LocalDate;

public interface CalculoBoletoPort {

    BoletoCalculado executar(String codigo, LocalDate dataPagamento);
}
