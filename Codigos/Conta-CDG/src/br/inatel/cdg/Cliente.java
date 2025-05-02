package br.inatel.cdg;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private long cpf;

    public Cliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Criando um cliente...");
        System.out.println("Nome do cliente: ");
        this.nome = sc.nextLine();
        System.out.println("CPF do cliente: ");
        this.cpf = sc.nextLong();
    }

    public String toString() {
        return "Nome: " + nome + " CPF: " + cpf;
    }

}
