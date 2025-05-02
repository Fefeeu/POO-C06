package br.com.inatel.campoMinado;

public class Bomba {
    public int espaco = -2;
    public boolean bandeira = false;
    public boolean acessado = false;

    public boolean explode(){
        if (espaco == -1){
            return true;
        } else {
            return false;
        }
    }

    public void ativar(){
        espaco = -1;
    }

    public void definirValor(int numeroDeBombas){
        espaco = numeroDeBombas;
    }

    public String toString(){
        if (espaco == -1){
            return "B";
        } else {
            return "_";
        }
    }
}
