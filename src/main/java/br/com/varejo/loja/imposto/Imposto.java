package br.com.varejo.loja.imposto;

import br.com.varejo.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

     BigDecimal calcular (Orcamento orcamento);


}
