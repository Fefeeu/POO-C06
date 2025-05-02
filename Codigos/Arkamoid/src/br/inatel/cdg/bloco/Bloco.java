package br.inatel.cdg.bloco;

public class Bloco {
    public int numero = 0;
    public static int numeroDeBlocos = 0;
    public static int blocosCriados = 0;

    public Bloco() {
        numero = numeroDeBlocos;
        numeroDeBlocos++;
        blocosCriados++;
    }

    public int destruirBloco() {
        numeroDeBlocos--;
        return 1;
    }
}
