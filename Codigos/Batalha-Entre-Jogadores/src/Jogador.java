import java.util.Scanner;

public class Jogador {
    private Arma arma;
    private int energia;
    private int vida;


    public Jogador(Arma arma, int vida, int energia) {
        this.arma = arma;
        this.vida = vida;
        this.energia = energia;
    }

    public void atacar(Jogador alvo){
        if(this.energia >= this.arma.verificaCustoDeEnergia()){
            alvo.sofrerDano(this.arma.verificaDano());
            this.energia -= this.arma.verificaCustoDeEnergia();
        } else {
            System.out.println("Energia insuficiente!");
        }
    }

    public void sofrerDano(int dano){
        this.vida -= dano;
    }

    public int getEnergia() {
        return this.energia;
    }

    public int getVida(){
        return this.vida;
    }

    public Arma getArma() {
        return this.arma;
    }

    public String toString(){
        return "Jogador:"
                + "\n   Vida: " + this.vida
                + "\n   Energia: " + this.energia
                + "\nArma: "
                + "\n   Dano: " + this.arma.verificaDano()
                + "\n   Energia: " + this.arma.verificaCustoDeEnergia();
    }

}
