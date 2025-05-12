import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            numeros.add(new Random().nextDouble()*100);
        }

        for(Double numero : numeros){
            System.out.print(numero + " ");
        }
        System.out.println("\n");

        Collections.sort(numeros, Collections.reverseOrder());

        for(Double numero : numeros){
            System.out.print(numero + " ");
        }

    }
}