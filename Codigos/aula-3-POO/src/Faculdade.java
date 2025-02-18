public class Faculdade{
    public String nome;
    public Professor professor;
    private int fundacao = 1980;// encapsulamento
    public void ministrarAulas(){
        professor.ministrarAula();
    }
}
