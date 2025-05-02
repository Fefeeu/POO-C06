package br.inatel.cdg;

import br.inatel.cdg.brownies.BrownieCafe;
import br.inatel.cdg.brownies.BrownieDoceDeLeite;
import br.inatel.cdg.brownies.BrownieNutela;
import br.inatel.cdg.comprador.Comprador;

public class Main {
    public static void main(String[] args) {
        BrownieNutela bn = new BrownieNutela("Brownie de Nutela", 9.50, "Nutela");
        BrownieDoceDeLeite bl = new BrownieDoceDeLeite("Brownie de Doce de Leite", 5.50, "Doce de Leite");
        BrownieCafe bc = new BrownieCafe("Brownie de Cafe", 4.50, "Café");

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
    }
}