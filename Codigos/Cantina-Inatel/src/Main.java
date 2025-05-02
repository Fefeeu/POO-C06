public class Main {
    public static void main(String[] args) {
        Cantina cantinaInatel = new Cantina();
        cantinaInatel.nome = "Cantina do Inatel";

        Salgado salgado1 = new Salgado();
        salgado1.nome = "Coxinha";
        Salgado salgado2 = new Salgado();
        salgado2.nome = "Lanche Pequeno";
        Salgado salgado3 = new Salgado();
        salgado3.nome = "Lanche Grande";

        cantinaInatel.addSalgado(salgado1);
        cantinaInatel.addSalgado(salgado2);
        cantinaInatel.addSalgado(salgado3);

        cantinaInatel.mostrarInfo();
    }
}