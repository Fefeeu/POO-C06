package br.inatel.cdg;

import br.inatel.cdg.animais.Boi;
import br.inatel.cdg.animais.Cachorro;
import br.inatel.cdg.animais.Lontra;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Scot", 20000);
        cachorro.emitirSom();
        cachorro.mostrarInfo();
        Lontra lontra = new Lontra("Ral", 4);
        lontra.emitirSom();
        lontra.mostrarInfo();
        lontra.nadar();
        Boi boi = new Boi("Bumba", 150);
        boi.emitirSom();
        boi.mostrarInfo();
    }
}