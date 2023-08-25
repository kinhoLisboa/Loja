package br.com.varejo.loja.orcamento.situacao;

import br.com.varejo.loja.orcamento.Orcamento;
import br.com.varejo.loja.orcamento.SituacaoOrcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
