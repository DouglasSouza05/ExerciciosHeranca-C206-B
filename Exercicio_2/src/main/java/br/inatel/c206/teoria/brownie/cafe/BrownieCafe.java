package br.inatel.c206.teoria.brownie.cafe;

import br.inatel.c206.teoria.brownie.Brownie;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando um Brownie de Cafe a compra");
    }

    public void adicionaCafe() {
        System.out.println("Adicionando Cafe ao Brownie");
    }
}