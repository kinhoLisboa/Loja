package br.com.varejo.loja.desconto;

import br.com.varejo.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

    public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximno) {
        super(proximno);
    }

    public BigDecimal calcular(Orcamento orcamento ) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximno.calcular(orcamento);
    }
}
