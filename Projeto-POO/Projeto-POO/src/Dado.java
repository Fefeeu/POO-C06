import java.util.Objects;
import java.util.Random;

public class Dado {
    // TODO não possui o tratamento se for inserido um numero negativo
    int rodarD20(String vantagem){
        Random dado1 = new Random();
        Random dado2 = new Random();
        int resultado1, resultado2;
        if(Objects.equals(vantagem, "vantagem")){
            resultado1 = dado1.nextInt(20) + 1;
            resultado2 = dado2.nextInt(20) + 1;
            System.out.println();
            return Math.max(resultado1, resultado2);
        } else if(Objects.equals(vantagem, "desvantagem")){
            resultado1 = dado1.nextInt(20) + 1;
            resultado2 = dado2.nextInt(20) + 1;
            System.out.println();
            return Math.min(resultado1, resultado2);
        } else {
            return dado1.nextInt(20) + 1;
        }

    }

    int rodarD100(int numero){
        StringBuilder resultado = new StringBuilder();
        int soma = 0;
        Random dado = new Random();
        for(int i=1;i<=numero;i++){
            int rolagem = (dado.nextInt(100) + 1);
            resultado.append(rolagem).append(" ");
            soma += rolagem;
        }
        if (numero != 1) {
            System.out.println(resultado);
        }
        return soma;
    }

    int rodarD12(int numero){
        StringBuilder resultado = new StringBuilder();
        int soma = 0;
        Random dado = new Random();
        for(int i=1;i<=numero;i++){
            int rolagem = (dado.nextInt(12) + 1);
            resultado.append(rolagem).append(" ");
            soma += rolagem;
        }
        if (numero != 1) {
            System.out.println(resultado);
        }
        return soma;
    }

    int rodarD10(int numero){
        StringBuilder resultado = new StringBuilder();
        int soma = 0;
        Random dado = new Random();
        for(int i=1;i<=numero;i++){
            int rolagem = (dado.nextInt(10) + 1);
            resultado.append(rolagem).append(" ");
            soma += rolagem;
        }
        if (numero != 1) {
            System.out.println(resultado);
        }
        return soma;
    }

    int rodarD8(int numero){
        StringBuilder resultado = new StringBuilder();
        int soma = 0;
        Random dado = new Random();
        for(int i=1;i<=numero;i++){
            int rolagem = (dado.nextInt(8) + 1);
            resultado.append(rolagem).append(" ");
            soma += rolagem;
        }
        if (numero != 1) {
            System.out.println(resultado);
        }
        return soma;
    }

    int rodarD6(int numero){
        StringBuilder resultado = new StringBuilder();
        int soma = 0;
        Random dado = new Random();
        for(int i=1;i<=numero;i++){
            int rolagem = (dado.nextInt(6) + 1);
            resultado.append(rolagem).append(" ");
            soma += rolagem;
        }
        if (numero != 1) {
            System.out.println(resultado);
        }
        return soma;
    }

    int rodarD4(int numero){
        StringBuilder resultado = new StringBuilder();
        int soma = 0;
        Random dado = new Random();
        for(int i=1;i<=numero;i++){
            int rolagem = (dado.nextInt(4) + 1);
            resultado.append(rolagem).append(" ");
            soma += rolagem;
        }
        if (numero != 1) {
            System.out.println(resultado);
        }
        return soma;
    }

    String rodarMoeda(int numero){
        StringBuilder resultado = new StringBuilder();
        int cara = 0;
        int coroa = 0;
        Random dado = new Random();
        for(int i=1;i<=numero;i++){
            int rolagem = (dado.nextInt(2));
            if (rolagem == 0) {
                resultado.append("Cara ");
                cara++;
            } else {
                resultado.append("Coroa ");
                coroa++;
            }
        }
        //TODO condicional para singular "cara" e "coroa"
        return resultado + "\n" + cara + " Caras\n" + coroa + " Coroas" ;
    }
}
