public class Zumbie {
    String nome;
    private int vida = 0;
    private int dano = 0;

    public Zumbie() {       // Sera executado 1 vez quando o objeto for criado e somente nesse momento
        System.out.println("Zumbie criado");
    }

    void seAlimentar() {
        System.out.println("Alimentando " + nome);
    }

    void setDano(int dano) {
        this.dano = dano;
    }
    void setVida(int vida) {
        this.vida = vida;
    }

    void sofrerDano(int dano) {
        vida -= dano;
    }

    void curarVida(int cura){
        vida += cura;
    }

    void causarDano(Zumbie alvo) {
        alvo.sofrerDano(dano);
        System.out.println(alvo.nome + " sofreu " + dano + " de dano de " + nome);
    }

    boolean transferirVida(Zumbie alvo, int vida) {
        if(vida > this.vida){
            System.out.println("Transferencia invalida, Vida inferior ao pedido");
            return false;
        } else {
            alvo.curarVida(vida);
            this.sofrerDano(vida);
            return true;
        }
    }

    void mostrarVida(){
        System.out.println("Vida atual de " + nome + " é " + vida);
    }


}
