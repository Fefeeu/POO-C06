public class Arma {
    private final int dano; // Uma variável tipo "final" define que o valor sera recebido somente uma vez
    private final int custoDeEnergia;

    public Arma(int dano, int custoDeEnergia) {
        this.dano = dano;
        this.custoDeEnergia = custoDeEnergia;
    }

    public int verificaDano() {
        return this.dano;
    }

    public int verificaCustoDeEnergia() {
        return this.custoDeEnergia;
    }
}
