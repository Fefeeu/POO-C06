package br.inatel.cdg.personagem;

import br.inatel.cdg.caracteristica.Combater;

public class Vilao extends Personagem implements Combater {
    public Vilao(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        if (personagem instanceof Heroi) {
            System.out.println("Usando uma Habilidade Especial do Vilao");
            personagem.vida = 0;
        } else {
            System.out.println("Personagem não é Heroi");
        }

    }
}
