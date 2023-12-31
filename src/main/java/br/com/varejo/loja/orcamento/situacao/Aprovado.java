package br.com.varejo.loja.orcamento.situacao;

import br.com.varejo.loja.DomainException;
import br.com.varejo.loja.orcamento.Orcamento;
import br.com.varejo.loja.orcamento.SituacaoOrcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
