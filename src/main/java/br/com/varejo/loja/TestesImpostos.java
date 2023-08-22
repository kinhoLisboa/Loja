package br.com.varejo.loja;

import br.com.varejo.loja.imposto.CalculadoraDeImpostos;
import br.com.varejo.loja.imposto.ICMS;
import br.com.varejo.loja.imposto.ISS;
import br.com.varejo.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args){
        Orcamento orcamernto = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamernto, new ICMS()));
    }
}
