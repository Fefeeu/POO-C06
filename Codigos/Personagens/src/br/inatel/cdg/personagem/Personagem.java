package br.inatel.cdg.personagem;

import br.inatel.cdg.arma.Arma;

public class Personagem {
    protected String nome;
    protected int vida;
    private Arma[] arma = new Arma[10];  // em um UML por padrão uma agregação, se não for dito, o paramentro é private

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void addArma(Arma arma){
        for(int i = 0; i < this.arma.length; i++){
            if(this.arma[i] == null){
                this.arma[i] = arma;
                break;
            }
            if(i == this.arma.length - 1){
                System.out.println("Erro ao adicionar arma, inventario cheio");
            }
        }
    }

    public void mostrarArmas(){
        for(int i = 0; i < this.arma.length; i++){
            if(this.arma[i] != null){
                System.out.println("Arma " + i + ":\n" + this.arma[i].toString());
            }
        }
    }

    public void atacar(int posicao, Personagem personagem){
        if(arma[posicao] == null){
            System.out.println("Erro ao atacar, Arma inexistente");
            return;
        }
        if(arma[posicao].getDurabilidade() <= 0){
            System.out.println("Erro ao atacar, Arma sem durabilidade");
            return;
        }
        if(personagem.vida <= 0){
            System.out.println("Já foi derrotado");
            return;
        }
        personagem.vida -= arma[posicao].getDano();
        arma[posicao].setDurabilidade(0);
    }

    public void limparArmas(){
        for(int i = 0; i < this.arma.length; i++){
            if(this.arma[i] != null){
                this.arma[i] = null;
            }
        }
    }
}
