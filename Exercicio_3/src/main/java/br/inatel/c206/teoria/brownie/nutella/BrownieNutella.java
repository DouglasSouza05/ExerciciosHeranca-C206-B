package br.inatel.c206.teoria.brownie.doce_de_leite.nutella;

import br.inatel.c206.teoria.brownie.Brownie;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella() {
        System.out.println("Adicionando Nutella ao Brownie");
    }
}
