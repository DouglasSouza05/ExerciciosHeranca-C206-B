package br.inatel.c206.teoria.brownie.nutella;

import br.inatel.c206.teoria.brownie.Brownie;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando um Brownie de Nutella a compra");
    }

    public void adicionaNutella() {
        System.out.println("Adicionando Nutella ao Brownie");
    }
}
