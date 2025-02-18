public class Main {
    public static void main(String[] args) {
        Personagem player1 = new Personagem();
        player1.nome = "Fefe";
        player1.pontos = 20;

        player1.arma = new Arma();
        player1.arma.nome = "Pistola";
        player1.arma.poder = 3;
        player1.arma.resistencia = 5;
        player1.arma.descricao = "Pistola calibre 12";

        Personagem player2 = new Personagem();
        player2.nome = "Cris";
        player2.pontos = 12;

        player2.arma = new Arma();
        player2.arma.nome = "Revolver";
        player2.arma.poder = 5;
        player2.arma.resistencia = 6;
        player2.arma.descricao = "Revolver de seis balas";

        player1.arma.mostrarInfoArma();
        player2.arma.mostrarInfoArma();
        System.out.println();

        player1.usarArma();
        player2.tomarDano();

        player2.usarArma();
        player1.tomarDano();

        player1.arma.mostrarInfoArma();
        player2.arma.mostrarInfoArma();

    }
}