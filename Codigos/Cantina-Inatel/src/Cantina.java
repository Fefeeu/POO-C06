public class Cantina {
    public String nome = "null";
    public Salgado[] salgados = new Salgado[3];

    public void addSalgado(Salgado novoSalgado) {
        for(int i=0; i<salgados.length; i++){
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                return;
            }
        }
    }
    public void mostrarInfo(){
        String lista = "Lista de salgados da " + nome + ": ";
        for(int i = 0; i < salgados.length; i++){
            if (salgados[i] != null){
                lista += salgados[i].nome;
                if (i != salgados.length - 1) {
                    lista += ", ";
                } else {
                    lista += ".";
                }
            }
        }
        System.out.println(lista);
    }
}
