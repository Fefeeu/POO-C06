package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        if(this.tipoTiro == "Normal" && ast.getTipoAsteroide() == "Grande"){
            System.out.println("Tiro sem força o suficiente para destruir o asteroide");
        } else {
            ast.destruir();
        }
    }
}
