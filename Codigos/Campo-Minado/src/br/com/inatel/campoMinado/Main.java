package br.com.inatel.campoMinado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CampoMinado campo = new CampoMinado();

        Scanner entrada = new Scanner(System.in);
        int numeroDeBombas;
        do {
            System.out.print("Numero de bombas(entre 1 e 100): ");
            numeroDeBombas = entrada.nextInt();
        }while(numeroDeBombas < 1 || numeroDeBombas > 10*10);
        campo.criarCampoMinado(numeroDeBombas);

        campo.mostrarCampoMinadoResposta();
        System.out.println();
        campo.mostrarCampoMinado();

        int x, y;
        int contadorJogadas = 0;
        boolean continuar = true;
        int numeroDeBandeiras = numeroDeBombas;

        while((contadorJogadas <  10*10 - numeroDeBombas || numeroDeBandeiras > 0) && continuar) {
            System.out.print("Deseja colocar bandeira(c), retirar bandeira(r), escolher quadrado(e), sair(s): ");
            String opcao = entrada.next();
            switch (opcao){
                case "c": {
                    System.out.println("Numero de bandeiras restantes: " + numeroDeBandeiras);
                    do {
                        System.out.print("Linha(entre 0 e 9): ");
                        x = entrada.nextInt();
                    }while (x < 0 || x > 9);
                    do {
                        System.out.print("Coluna(entre 0 e 9): ");
                        y = entrada.nextInt();
                    }while (y < 0 || y > 9);
                    System.out.println(campo.acessado(x,y));
                    if(!campo.acessado(x, y)){
                        numeroDeBandeiras--;
                    }
                    campo.colocarBandeira(x, y);
                    break;
                }
                case "r":{
                    do {
                        System.out.print("Linha(entre 0 e 9): ");
                        x = entrada.nextInt();
                    }while (x < 0 || x > 9);
                    do {
                        System.out.print("Coluna(entre 0 e 9): ");
                        y = entrada.nextInt();
                    }while (y < 0 || y > 9);
                    numeroDeBandeiras++;
                    campo.removerBandeira(x, y);
                    break;
                }
                case "e": {
                    System.out.println("Numero de jogadas: " + contadorJogadas);
                    do {
                        System.out.print("Linha(entre 0 e 9): ");
                        x = entrada.nextInt();
                    }while (x < 0 || x > 9);
                    do {
                        System.out.print("Coluna(entre 0 e 9): ");
                        y = entrada.nextInt();
                    }while (y < 0 || y > 9);

                    if(!campo.acessado(x, y)) {
                        campo.acessado(x, y);
                        contadorJogadas++;
                    }

                    if (campo.pisar(x, y)) {
                        System.out.println("Fim de jogo");
                        continuar = false;
                    } else {
                        campo.numeroDeBombas(x, y);
                        campo.mostrarCampoMinado();
                    }
                    break;
                }
                case "s": {
                    continuar = false;
                    break;
                }
                default: {
                    break;
                }
            }

        }

        if (contadorJogadas == 10*10 - numeroDeBombas && numeroDeBandeiras == 0) {
            System.out.println(" -= PARABENS =-");
        }

    }
}