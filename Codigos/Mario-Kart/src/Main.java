
public class Main {
    public static void main(String[] args) {
        Kart kart1 = new Kart();
        kart1.nome = "Kart 1";
        kart1.piloto = new Piloto();
        kart1.piloto.nome = "Piloto 1";
        kart1.piloto.vilao = false;

        Kart kart2 = new Kart();
        kart2.nome = "Kart 2";
        kart2.piloto = new Piloto();
        kart2.piloto.nome = "Piloto 2";
        kart2.piloto.vilao = true;

        System.out.println(kart1.nome);
        kart1.motor.mostrarInfo();
        System.out.println(kart2.nome);
        kart2.motor.mostrarInfo();

        kart1.soltarTurbo();
        kart1.fazerDrift();
        kart1.piloto.soltarSuperPoder();

    }
}