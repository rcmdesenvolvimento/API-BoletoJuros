package com.grid.informatica.apiboletosjuros.core.usecase;

import com.grid.informatica.apiboletosjuros.core.domain.Boleto;
import com.grid.informatica.apiboletosjuros.core.domain.BoletoCalculado;
import com.grid.informatica.apiboletosjuros.core.domain.enums.TipoBoleto;
import com.grid.informatica.apiboletosjuros.core.domain.enums.TipoExcecao;
import com.grid.informatica.apiboletosjuros.core.exception.ApplicationException;
import com.grid.informatica.apiboletosjuros.core.port.in.CalculoBoletoPort;
import com.grid.informatica.apiboletosjuros.core.port.out.ComplementoBoletoPort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CalcularBoletoUseCase implements CalculoBoletoPort {

    private final ComplementoBoletoPort complementoBoletoPort;

    public CalcularBoletoUseCase(ComplementoBoletoPort complementoBoletoPort) {
        this.complementoBoletoPort = complementoBoletoPort;
    }

    @Override
    public BoletoCalculado executar(String codigo, LocalDate dataPagamento) {

        var boleto = complementoBoletoPort.executar(codigo);
        validar(boleto);
        return null;
    }

    private void validar(Boleto boleto) {

        if (boleto == null) {
            throw new ApplicationException(TipoExcecao.BOLETO_INVALIDO);
        }

        if (boleto.getTipo() != TipoBoleto.XPTO) {
            throw new ApplicationException(TipoExcecao.TIPO_BOLETO_INVALIDO);
        }

        if (boleto.getDataVencimento().isAfter(LocalDate.now())) {
            throw new ApplicationException(TipoExcecao.BOLETO_NAO_VENCIDO);
        }

    }
}
