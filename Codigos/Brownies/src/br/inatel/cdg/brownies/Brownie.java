package br.inatel.cdg.brownies;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie (String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Carrinho de compras:"
        + "\nNome: " + nome
        + "\nPreco: " + preco);
    }

    public void calcularValorTotalCompra(){
        System.out.println("calculando valor total");
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome
        + "\nPreco: " + preco
        + "\nSabor: " + sabor);
    }

    public double getPreco() {
        return preco;
    }
}
