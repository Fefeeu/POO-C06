package br.inatel.cdg.jogador;
import br.inatel.cdg.bloco.Bloco;

public class Jogador {
    private int pontuacao = 0;

    public void destruirBloco(Bloco bloco) {
        pontuacao += bloco.destruirBloco();
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
