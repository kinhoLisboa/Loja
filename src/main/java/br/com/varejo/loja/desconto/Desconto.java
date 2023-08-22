package br.com.varejo.loja.desconto;

import br.com.varejo.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Desconto {

    protected Desconto proximno;

    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return proximno.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo (Orcamento orcamento);
    protected abstract boolean deveAplicar(Orcamento orcamento);
}
