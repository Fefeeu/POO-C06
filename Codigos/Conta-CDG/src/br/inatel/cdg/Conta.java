package br.inatel.cdg;

import java.util.HashSet;
import java.util.Scanner;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private HashSet<Cliente> clientes = new HashSet<>();

    public Conta(int numeroClientes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de clientes: ");

        for(int i = 0; i < numeroClientes; i++){
            clientes.add(new Cliente());
            System.out.println("teste");
        }
        Cliente clienteNulo = null;
        clientes.add(clienteNulo); // criando um cliente nulo
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void sacar(float quantidade) {
        if(quantidade > this.saldo){
            System.out.println("Saldo Insuficiente");
        } else if(quantidade > this.limite){
            System.out.println("Limite Insuficiente");
        } else if(quantidade < 0){
            System.out.println("Valor Invalido");
        } else {
            this.saldo -= quantidade;
        }
    }
    public void depositar(float quantidade) {
        if(quantidade < 0){
            System.out.println("Valor Invalido");
        } else {
            this.saldo += quantidade;
        }
    }

    public void mostrarClientes(){
        for(Cliente cliente: clientes){
            System.out.println("Ciente: " + cliente.toString());
        }
    }

    public void mostrarInfo(){
        String listaClientes = "";
        for(Cliente cliente : clientes){
            try {
                listaClientes += cliente.toString() + "\n      ";
            } catch (NullPointerException e) {
                listaClientes += "cliente nulo.\n      ";
            }
        }
        System.out.println("Saldo: " + saldo
        + "\nLimite: " + limite
        + "\nClientes: " + listaClientes);
    }
}
