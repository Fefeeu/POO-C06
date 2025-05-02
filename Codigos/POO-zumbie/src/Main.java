public class Main {
    public static void main(String[] args) {
        Zumbie z1 = new Zumbie();
        Zumbie z2 = new Zumbie();

        z1.nome = "Alex";
        z1.setVida(100);
        z1.setDano(50);

        z2.nome = "Bob";
        z2.setVida(200);
        z2.setDano(75);

        z1.mostrarVida();
        z2.mostrarVida();
        System.out.println();

        z1.sofrerDano(50);
        z2.sofrerDano(50);
        z1.mostrarVida();
        z2.mostrarVida();
        System.out.println();

        z1 = z2;
        z1.mostrarVida();
        z2.mostrarVida();
        System.out.println();

        z1.sofrerDano(20);
        z2.sofrerDano(30);
        z1.mostrarVida();
        z2.mostrarVida();
        System.out.println();
    }
}