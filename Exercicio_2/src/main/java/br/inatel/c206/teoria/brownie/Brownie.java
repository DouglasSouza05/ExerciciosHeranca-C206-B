package br.inatel.c206.teoria.brownie;

public abstract class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public abstract void addCarrinhoDeCompras();

    public void calculaValorTotalCompra() {
        System.out.println("Calculando o Valor Total da Compra");
    }

    public void mostraInfo() {
        System.out.println("Nome do Brownie: " + this.nome);
        System.out.println("Preço do Brownie: " + this.preco);
        System.out.println("Sabor do Brownie: " + this.sabor);
    }

    public String getSabor() {
        return sabor;
    }
}
