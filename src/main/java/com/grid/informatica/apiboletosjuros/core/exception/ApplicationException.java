package com.grid.informatica.apiboletosjuros.core.exception;

import com.grid.informatica.apiboletosjuros.core.domain.enums.TipoExcecao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class ApplicationException extends RuntimeException {
    private TipoExcecao tipoExcecao;
}
