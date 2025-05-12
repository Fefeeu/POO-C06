package br.inatel.cdg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hash = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int numReps = 100000;
        double mediaListIncercao = 0;
        double mediaHashIncercao = 0;
        double mediaMapIncercao = 0;

        long tempoInicial, tempoFinal;

        int quantidadeIncercao = 1000;  // 1000 repetições demorou no maximo 15 segundos
        for(int j = 0; j < quantidadeIncercao; j++) {
            tempoInicial = System.currentTimeMillis();
            for (int i = 0; i < numReps; i++) {
                list.add(i);
            }
            tempoFinal = System.currentTimeMillis();
            mediaListIncercao += (double) (tempoFinal - tempoInicial);

            tempoInicial = System.currentTimeMillis();
            for (int i = 0; i < numReps; i++) {
                hash.add(i);
            }
            tempoFinal = System.currentTimeMillis();
            mediaHashIncercao += (double) (tempoFinal - tempoInicial);

            tempoInicial = System.currentTimeMillis();
            for (int i = 0; i < numReps; i++) {
                map.put(i, -i);
            }
            tempoFinal = System.currentTimeMillis();
            mediaMapIncercao += (double) (tempoFinal - tempoInicial);
        }
        System.out.println("Media List Incerção: " + mediaListIncercao/quantidadeIncercao
        + "\nMedia Hash Incerção: " + mediaHashIncercao/quantidadeIncercao
        + "\nMedia Map Incerção: " + mediaMapIncercao/quantidadeIncercao);

        double mediaListBusca = 0;
        double mediaHashBusca = 0;
        double mediaMapBusca = 0;

        int quantidadeBusca = 10;   // 100 repetiçõe demorou por volta de 10 minutos
        for(int j = 0; j < quantidadeBusca; j++) {
            tempoInicial = System.currentTimeMillis();
            for(int i = 0; i < numReps; i++) {
              list.contains(i);
            }
            tempoFinal = System.currentTimeMillis();
            mediaListBusca += (double) (tempoFinal - tempoInicial);

            tempoInicial = System.currentTimeMillis();
            for(int i = 0; i < numReps; i++) {
                hash.contains(i);
            }
            tempoFinal = System.currentTimeMillis();
            mediaHashBusca += (double) (tempoFinal - tempoInicial);

            tempoInicial = System.currentTimeMillis();
            for(int i = 0; i < numReps; i++) {
                map.containsKey(i);
            }
            tempoFinal = System.currentTimeMillis();
            mediaMapBusca += (double) (tempoFinal - tempoInicial);
        }
        System.out.println("Media List Busca: " + mediaListBusca/quantidadeBusca
        + "\nMedia Hash Busca: " + mediaHashBusca/quantidadeBusca
        + "\nMedia Map Busca: " + mediaMapBusca/quantidadeBusca);
    }
}