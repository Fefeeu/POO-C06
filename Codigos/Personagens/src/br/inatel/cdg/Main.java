package br.inatel.cdg;

import br.inatel.cdg.arma.Arma;
import br.inatel.cdg.personagem.Heroi;
import br.inatel.cdg.personagem.Vilao;

public class Main {
    public static void main(String[] args) {
        Heroi heroi = new Heroi("Blue Prince", 100);
        Vilao vilao = new Vilao("Red Prince", 100);
        Arma[] listaDeArmas = new Arma[4];

        listaDeArmas[0] = new Arma("Arma A", 60, 10);
        listaDeArmas[1] = new Arma("Arma B", 40, 3);
        listaDeArmas[2] = new Arma("Arma C", 80, 20);
        listaDeArmas[3] = new Arma("Arma D", 20, 5);

        heroi.addArma(listaDeArmas[0]);
        heroi.addArma(listaDeArmas[1]);
        vilao.addArma(listaDeArmas[2]);
        vilao.addArma(listaDeArmas[3]);

        heroi.mostrarArmas();
        vilao.mostrarArmas();

        heroi.atacar(1, vilao);
        vilao.atacar(1, heroi);

        System.out.println("Vida heroi: " + heroi.getVida() + "\nVida vilao: " + vilao.getVida());

        heroi.usarEspecial(vilao);
        vilao.usarEspecial(heroi);
    }
}