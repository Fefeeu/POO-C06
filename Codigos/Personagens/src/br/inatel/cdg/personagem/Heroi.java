package br.inatel.cdg.personagem;

import br.inatel.cdg.caracteristica.Combater;

public class Heroi extends Personagem implements Combater {
    public Heroi(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem p) {
        if (p instanceof Vilao) {
            System.out.println("Usando uma Habilidade Especial do Heroi");
            p.limparArmas();
        } else {
            System.out.println("Personagem não é vilao");
        }

    }
}