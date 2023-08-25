package br.com.varejo.loja.orcamento;

import br.com.varejo.loja.DomainException;
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
public abstract class SituacaoOrcamento {

    public void aprovar (Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser aprovado!");
    }
    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser reprovado!");
    }
    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser finalizado!");
    }

    public BigDecimal calcularValordescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
