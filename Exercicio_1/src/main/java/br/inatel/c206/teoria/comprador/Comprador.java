package br.inatel.c206.teoria.comprador;

import br.inatel.c206.teoria.brownie.Brownie;

public class Comprador {

    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie) {
        System.out.println("O comprador " + this.nome + " efetuou a comprou o Brownie de " + brownie.getSabor());
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
    }
}
