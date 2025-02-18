public class Conta {
    //
    private float saldo = 0;  // deixando-a privada, nao posso diretamente mudar o valor do saldo
    float limite;             // porem ainda posso usala dentro da propria classe
    int numeroDaConta;
    String titular;

    // Metodos
    public void sacar(float quantidade){
        saldo -= quantidade;
    }

    public void depositar(float quantidade){
        saldo += quantidade;
    }

    public void transferir(Conta destino, float quantidade){
        sacar(quantidade);
        destino.depositar(quantidade);
    }

    public void verificarSaldo(){
        System.out.println(saldo);
    }

}
