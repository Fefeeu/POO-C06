package br.inatel.cdg;
import br.inatel.cdg.bloco.Bloco;
import br.inatel.cdg.jogador.Conversor;
import br.inatel.cdg.jogador.Jogador;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Bloco> blocosLista = new ArrayList<Bloco>();

        Jogador jogador1 = new Jogador();

        for (int i = 0; i < 10; i++) {
            blocosLista.add(new Bloco());
        }

        jogador1.destruirBloco(blocosLista.get(0));
        jogador1.destruirBloco(blocosLista.get(1));
        jogador1.destruirBloco(blocosLista.get(2));
        jogador1.destruirBloco(blocosLista.get(3));

        System.out.println("Numero de blocos criados: " + Bloco.blocosCriados);
        System.out.println("Numero de blocos destruidos: " + (Bloco.blocosCriados - Bloco.numeroDeBlocos));
        System.out.println("Numero de blocos restantes: " + Bloco.numeroDeBlocos);

        System.out.println("Pontuação do jogador: " + Conversor.moedas(jogador1.getPontuacao()));
    }
}