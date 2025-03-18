package br.com.inatel.campoMinado;

import java.util.Random;

public class CampoMinado {
    private Bomba[][] grid = new Bomba[10][10];
    private Bomba[][] bandeira = new Bomba[10][10];
    private String campo = "";

    public void criarCampoMinado(int numeroDeBombas){
        Random rand = new Random();
        Bomba ativa = new Bomba();
        ativa.ativar();

        // criação do campo em si
        for(int i = 0; i < numeroDeBombas; i++){
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            if(grid[x][y] == null){
                grid[x][y] = ativa;
            } else {
                i--;
            }
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                bandeira[i][j] = new Bomba();
                if(grid[i][j] == null){
                    grid[i][j] = new Bomba();
                }
                grid[i][j].acessado = false;
            }
        }
    }

    public void colocarBandeira(int x, int y){
        bandeira[x][y].bandeira = true;
        this.mostrarCampoMinado();

    }
    public void removerBandeira(int x, int y){
        bandeira[x][y].bandeira = false;
        this.mostrarCampoMinado();
    }

    public boolean pisar(int x, int y){
        boolean explodiu = grid[x][y].explode();
        if (explodiu){
            grid[x][y].definirValor(-3);
            this.mostrarCampoMinado();
            System.out.println("Infelizmente a bomba explodiu");
        } else {
            grid[x][y].acessado = true;
            System.out.println("Não há bombas aqui");
        }
        return explodiu;
    }

    public void numeroDeBombas(int x, int y){
        int count = 0;
        int voltaX = x - 1;
        int voltaY = y - 1;

        while (voltaX <= x+1){
            while (voltaY <= y+1){
                if ((voltaX >= 0 && voltaX < grid.length) && (voltaY >= 0 && voltaY < grid[0].length)){
                    if(grid[voltaX][voltaY] != null && grid[voltaX][voltaY].explode()){
                        count++;
                    }
                }
                voltaY++;
            }
            voltaY = y - 1;
            voltaX++;
        }
        grid[x][y].definirValor(count);
    }


    public boolean acessado(int x, int y){
        if(grid[x][y].acessado){
            return true;
        } else {
            return false;
        }
    }

    public void mostrarCampoMinadoResposta(){
        String coluna = "X  ";
        for(int i = 0; i < grid.length; i++){
            coluna += i + " ";
        }
        System.out.println(coluna);
        for(int i = 0; i < grid.length; i++){
            coluna = "" + i + "  ";
            for(int j = 0; j < grid[i].length; j++){
                coluna += grid[i][j].toString() + " ";
            }
            System.out.println(coluna);
        }
    }

    public void mostrarCampoMinado(){
        campo = "";
        campo = campoToString();
        System.out.println(campo);
        campo = "";
    }

    public String campoToString(){
        String coluna = "X  ";
        for(int i = 0; i < grid.length; i++){
            coluna += i + " ";
        }
        System.out.println(coluna);
        for(int i = 0; i < grid.length; i++){
            coluna = "" + i + "  ";
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j].espaco > -1){
                    coluna += grid[i][j].espaco + " ";
                } else if (grid[i][j].espaco == -3){
                    coluna += "B ";
                } else if (bandeira[i][j].bandeira){
                    coluna += "b ";
                } else {
                    coluna += "x ";
                }
            }
            campo += coluna + "\n";
        }
        return campo;
    }
}
