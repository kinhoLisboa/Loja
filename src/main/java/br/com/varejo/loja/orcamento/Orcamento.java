package br.com.varejo.loja.orcamento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
}
