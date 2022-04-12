package br.inatel.c206.teoria.brownie.doce_de_leite;

import br.inatel.c206.teoria.brownie.Brownie;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando um Brownie de Doce de Leite a compra");
    }

    public void adicionaDoceDeLeite() {
        System.out.println("Adicionando Doce de Leite ao Brownie");
    }
}