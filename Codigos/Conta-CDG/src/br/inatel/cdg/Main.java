package br.inatel.cdg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero da conta: ");
        int numero = sc.nextInt();
        conta.setNumero(numero);
        System.out.println("Saldo da conta: ");
        float saldo = sc.nextFloat();
        conta.setSaldo(saldo);
        System.out.println("Limite da conta: ");
        float limite = sc.nextFloat();
        conta.setLimite(limite);

        conta.mostrarClientes();

        System.out.println("Sacar: ");
        float sacar = sc.nextFloat();
        conta.sacar(sacar);
        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.println("Deposito: ");
        float deposito = sc.nextFloat();
        conta.depositar(deposito);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}