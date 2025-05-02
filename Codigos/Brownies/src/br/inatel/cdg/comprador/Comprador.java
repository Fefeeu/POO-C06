package br.inatel.cdg.comprador;

import br.inatel.cdg.brownies.Brownie;

public class Comprador {
    private String nome;
    private double saldo;
    private Brownie[] brownies = new Brownie[10];

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){
        if (this.saldo < brownie.getPreco()){
            System.out.println("Saldo Insuficiente");
        } else {
            for(int i = 0; i < brownies.length; i++){
                if(brownies[i] == null){
                    saldo -= brownie.getPreco();
                    brownies[i] = brownie;
                    break;
                } else if (i == brownies.length - 1){
                    System.out.println("Lista de compra cheia");
                }
            }
        }
    }

    public void mostrarListaDeCompras(){
        System.out.println("\n\n\n Listado de compras de " + nome + ": ");

        for(int i = 0; i < brownies.length; i++){
            if(brownies[i] != null){
                brownies[i].mostrarInfo();
                System.out.println("\n");
            }
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
