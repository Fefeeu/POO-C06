import java.util.Objects;
import java.util.Scanner;

public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;

    public Kart(){
        motor = new Motor();
        Scanner sc;
        String cilindradas;
        do {
            System.out.println("Informa as Cilindradas do motor entre as opções 50, 100, 150");
            sc = new Scanner(System.in);
            cilindradas = sc.nextLine();
        } while (!Objects.equals(cilindradas, "50") &&
                !Objects.equals(cilindradas, "100") &&
                !Objects.equals(cilindradas, "150"));

        float velocidade;
        do{
            System.out.println("Informe a velocidade entre 0 e 150");
            sc = new Scanner(System.in);
            velocidade = sc.nextFloat();
        }while(velocidade < 0 || velocidade > 150);

        motor.cilindradas = cilindradas;
        motor.velocidadeMaxima = velocidade;
    }

    void soltarTurbo(){
        System.out.println("Soltando Turbo...");
    }

    void fazerDrift(){
        System.out.println("Fazendo Drift...");
    }
}
