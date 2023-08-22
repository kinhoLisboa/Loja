package br.com.varejo.loja.desconto;

import br.com.varejo.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto{

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximno) {
        super(proximno);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento ) {

            return orcamento.getValor().multiply(new BigDecimal("0.1"));

    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500"))> 0;
    }
}
