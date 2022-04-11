package br.inatel.c206.teoria.brownie.doce_de_leite;

import br.inatel.c206.teoria.brownie.Brownie;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite() {
        System.out.println("Adicionando Doce de Leite ao Brownie");
    }
}
