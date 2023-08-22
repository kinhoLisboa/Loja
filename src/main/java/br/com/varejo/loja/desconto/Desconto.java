package br.com.varejo.loja.desconto;

import br.com.varejo.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Desconto {

    protected Desconto proximno;

    public abstract BigDecimal calcular (Orcamento orcamento);
}
