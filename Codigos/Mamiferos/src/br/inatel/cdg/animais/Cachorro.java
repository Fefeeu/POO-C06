package br.inatel.cdg.animais;

public class Cachorro extends Mamifero {
    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("AU! AU! AU! AU!");
    }
}
