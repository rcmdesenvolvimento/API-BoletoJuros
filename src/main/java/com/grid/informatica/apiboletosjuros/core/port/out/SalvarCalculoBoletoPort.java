package com.grid.informatica.apiboletosjuros.core.port.out;

import com.grid.informatica.apiboletosjuros.core.domain.BoletoCalculado;

public interface SalvarCalculoBoletoPort {

    void executar(BoletoCalculado boletoCalculado);
}
