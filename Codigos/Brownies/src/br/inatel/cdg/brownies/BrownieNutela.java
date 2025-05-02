package br.inatel.cdg.brownies;

public class BrownieNutela extends Brownie {
    public BrownieNutela(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionarNutela(){
        System.out.println("Adicionando Nutela");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando no carrinho de compras Brownie de Nutela:"
                + "\nNome: " + nome
                + "\nPreco: " + preco);
    }
}
