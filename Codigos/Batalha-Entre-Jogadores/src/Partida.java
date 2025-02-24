import java.util.Scanner;

public class Partida {
    private Jogador arrayDeJogadores;

    public boolean adicionarJogadorNaLista(Jogador jogador){
        arrayDeJogadores = new Jogador(jogador.getArma(), jogador.getVida(), jogador.getEnergia());
        return true;
    }

    public void lutaDeJogadores(Jogador jogador1, Jogador jogador2){
        System.out.println("Antes: \n" + jogador1.toString() + "\n" + jogador2.toString());
        jogador1.atacar(jogador2);
        jogador2.atacar(jogador1);
        System.out.println("\n\nDepois: \n" + jogador1.toString() + "\n" + jogador2.toString());
    }

    public void listarJogadoresEArmas(){
        System.out.println(this.arrayDeJogadores.toString());
    }
}
