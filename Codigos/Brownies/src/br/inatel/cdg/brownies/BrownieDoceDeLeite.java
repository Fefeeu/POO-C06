package br.inatel.cdg.brownies;

public class BrownieDoceDeLeite extends Brownie{
    public BrownieDoceDeLeite(String nome, int preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionarDoceDeLeite() {
        System.out.println("Adicionando Doce de Leite");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando no carrinho de compras Brownie de Doce de Leite:"
                + "\nNome: " + nome
                + "\nPreco: " + preco);
    }
}
