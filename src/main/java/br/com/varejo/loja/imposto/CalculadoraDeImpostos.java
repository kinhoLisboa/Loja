package br.com.varejo.loja.imposto;

import br.com.varejo.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular (Orcamento orcamento, Imposto imposto){

        return imposto.calcular(orcamento);

    }
}
