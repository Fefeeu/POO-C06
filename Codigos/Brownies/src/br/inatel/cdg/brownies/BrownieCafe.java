package br.inatel.cdg.brownies;

public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, int preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionarCafe(){
        System.out.println("Adicionando Cafe");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando no carrinho de compras Brownie de Cafe:"
                + "\nNome: " + nome
                + "\nPreco: " + preco);
    }
}
