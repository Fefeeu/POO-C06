package br.inatel.cdg.animais;

import br.inatel.cdg.inter.Aquatico;

public class Lontra extends Mamifero implements Aquatico {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Tsi-ti! Tsi-ti! Tsi-ti!");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando ...");
    }
}
