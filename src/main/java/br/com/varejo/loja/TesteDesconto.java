package br.com.varejo.loja;

import br.com.varejo.loja.desconto.CalculadoraDeDescontos;
import br.com.varejo.loja.imposto.CalculadoraDeImpostos;
import br.com.varejo.loja.imposto.ICMS;
import br.com.varejo.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {

    public static void main(String[] args){
        Orcamento primeiro = new Orcamento(new BigDecimal("100"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("2000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
