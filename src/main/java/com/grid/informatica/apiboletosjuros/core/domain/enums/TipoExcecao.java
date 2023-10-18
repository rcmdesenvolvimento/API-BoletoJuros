package com.grid.informatica.apiboletosjuros.core.domain.enums;

public enum TipoExcecao {

    BOLETO_INVALIDO {
        @Override
        public String getMensagemErro() {
            return "O boleto encontrado é inválido!";
        }
    },

    TIPO_BOLETO_INVALIDO {
        @Override
        public String getMensagemErro() {
            return "Infeliamente só poderemos calcular os juros dos boletos XPTO!";
        }
    },

    BOLETO_NAO_VENCIDO {
        @Override
        public String getMensagemErro() {
            return "O boleto informado ainda não está vencido!";
        }
    };

    public abstract String getMensagemErro();
}
