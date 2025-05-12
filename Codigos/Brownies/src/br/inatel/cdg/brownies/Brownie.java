package br.inatel.cdg.brownies;

import java.io.Serializable;

public abstract class Brownie implements Comparable<Brownie>{
    protected String nome;
    protected int preco;
    protected String sabor;

    public Brownie (String nome, int preco, String sabor) {
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

    public int getPreco() {
        return preco;
    }

    // --------------- ESSE METODO É PRECISO PARA ORDERNAR NA COMPARABLE ---------------
    public int compareTo(Brownie b){
        return Integer.compare(this.preco, b.getPreco());
        // return Integer.compare(b.getPreco(), this.preco); // ordem inversa
    }
}
