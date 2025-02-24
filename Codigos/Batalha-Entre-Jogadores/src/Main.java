import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Partida partida = new Partida();

        Scanner sc = new Scanner(System.in);
        System.out.print("Vida do Jogador: ");
        int vida = sc.nextInt();
        System.out.print("Energia do Jogador: ");
        int energia = sc.nextInt();

        System.out.print("Dano da arma: ");
        int dano = sc.nextInt();
        System.out.print("Custo de Energia da arma: ");
        int custoEnergia = sc.nextInt();
        Arma arma = new Arma(dano, custoEnergia);

        Jogador jogador1 = new Jogador(arma, vida, energia);

        boolean sucesso = false;
        sucesso = partida.adicionarJogadorNaLista(jogador1);
        if (sucesso) {
            System.out.println("Jogadores atualizados com sucesso!");
        } else {
            System.out.println("Erro ao atualizar os jogadores!");
        }

        partida.listarJogadoresEArmas();

        System.out.print("Vida do Jogador: ");
        vida = sc.nextInt();
        System.out.print("Energia do Jogador: ");
        energia = sc.nextInt();

        System.out.print("Dano da arma: ");
        dano = sc.nextInt();
        System.out.print("Custo de Energia da arma: ");
        custoEnergia = sc.nextInt();
        arma = new Arma(dano, custoEnergia);

        Jogador jogador2 = new Jogador(arma, vida, energia);

        partida.lutaDeJogadores(jogador1, jogador2);
    }
}