package br.inatel.cdg;

import java.util.Scanner;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] cliente;

    public Conta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de clientes: ");
        int numeroClientes = sc.nextInt();
        cliente = new Cliente[numeroClientes];
        for(int i = 0; i < cliente.length; i++){
            cliente[i] = new Cliente();
        }
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
        for(int i = 0; i < cliente.length; i++){
            System.out.println("Ciente " + i + ": " + cliente[i].toString());
        }
    }
}
