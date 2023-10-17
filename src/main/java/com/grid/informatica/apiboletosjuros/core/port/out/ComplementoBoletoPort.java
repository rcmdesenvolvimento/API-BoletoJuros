package com.grid.informatica.apiboletosjuros.core.port.out;

import com.grid.informatica.apiboletosjuros.core.domain.Boleto;

public interface ComplementoBoletoPort {
    Boleto executar(String codigo);
}
