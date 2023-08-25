package br.com.varejo.loja.orcamento;

import br.com.varejo.loja.orcamento.situacao.Aprovado;
import br.com.varejo.loja.orcamento.situacao.EmAnalise;
import br.com.varejo.loja.orcamento.situacao.Finalizado;
import br.com.varejo.loja.orcamento.situacao.Reprovado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(SituacaoOrcamento situacao) {
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = this.situacao.calcularValordescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }
    public void aprovar(){
        this.situacao.aprovar(this);
    }
    public void reprovar(){
        this.situacao.reprovar(this);
    }
    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public void setSituacao(Finalizado finalizar) {
    }


    public void setSituacao(Aprovado aprovado) {
    }

    public void setSituacao(Reprovado reprovado) {
    }
}
