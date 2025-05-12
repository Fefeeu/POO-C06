package br.inatel.cdg;

import br.inatel.cdg.brownies.Brownie;
import br.inatel.cdg.brownies.BrownieCafe;
import br.inatel.cdg.brownies.BrownieDoceDeLeite;
import br.inatel.cdg.brownies.BrownieNutela;
import br.inatel.cdg.comprador.Comprador;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BrownieNutela bn = new BrownieNutela("Brownie de Nutela", 9, "Nutela");
        BrownieDoceDeLeite bl = new BrownieDoceDeLeite("Brownie de Doce de Leite", 5, "Doce de Leite");
        BrownieCafe bc = new BrownieCafe("Brownie de Cafe", 4, "Café");

        bn.adicionarNutela();
        bn.addCarrinhoDeCompras();
        bn.mostrarInfo();

        bl.adicionarDoceDeLeite();
        bl.addCarrinhoDeCompras();
        bl.mostrarInfo();

        bc.adicionarCafe();
        bc.addCarrinhoDeCompras();
        bc.mostrarInfo();

        Comprador comprador = new Comprador("Fefe", 1000);
        System.out.println(comprador.getSaldo());
        comprador.efetuarCompra(bn);
        comprador.efetuarCompra(bl);
        comprador.efetuarCompra(bc);
        comprador.mostrarListaDeCompras();
        System.out.println(comprador.getSaldo());


        // --------------- SORT DA LISTA ---------------
        ArrayList<Brownie> listaBrownie = new ArrayList<>();
        listaBrownie.add(bn);
        listaBrownie.add(bl);
        listaBrownie.add(bc);

        Collections.sort(listaBrownie);
        for (Brownie b : listaBrownie) {
            b.mostrarInfo();
        }
    }
}