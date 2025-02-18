public class Main {
    public static void main(String[] args) {
        Conta contaFefe = new Conta();
        contaFefe.titular = "Fefe";
        contaFefe.numeroDaConta = 1;
        contaFefe.limite = 1000;
        contaFefe.depositar(600);
        System.out.print("Saldo da conta de " + contaFefe.titular + " eh de ");
        contaFefe.verificarSaldo();

        Conta contaCris = new Conta();
        contaCris.titular = "Cris";
        contaCris.numeroDaConta = 2;
        contaCris.limite = 1000;
        contaCris.depositar(600);
        System.out.print("Saldo da conta de " + contaCris.titular + " eh de ");
        contaCris.verificarSaldo();

        contaFefe.transferir(contaCris, 300);
        System.out.println("\nFeita a transferencia\n");

        System.out.print("Saldo da conta de " + contaFefe.titular + " eh de ");
        contaFefe.verificarSaldo();
        System.out.print("Saldo da conta de " + contaCris.titular + " eh de ");
        contaCris.verificarSaldo();

    }
}