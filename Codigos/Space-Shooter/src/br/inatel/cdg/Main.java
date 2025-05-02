package br.inatel.cdg;
import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nome da nave: ");
        String nome = sc.nextLine();
        System.out.print("Vida da nave: ");
        double vida = sc.nextDouble();
        String tipo;
        do {
            System.out.print("Tipo de tiro da nave, ('Normal' ou 'Explosivo'): ");
            tipo = sc.nextLine();
        }while(tipo != "Normal" && tipo != "Explosivo");

        Nave nave1 = new Nave(nome, vida, tipo);

        System.out.print("Nome do asteroide: ");
        nome = sc.nextLine();
        do {
            System.out.print("Tipo do asteroide, ('Pequeno' ou 'Grande'): ");
            tipo = sc.nextLine();
        }while(tipo != "Pequeno" && tipo != "Grande");

        Asteroide asteroide1 = new Asteroide(nome, tipo);

        nave1.atirar(asteroide1);
    }
}