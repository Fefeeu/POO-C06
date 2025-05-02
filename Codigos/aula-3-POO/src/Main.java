import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Fefe";
        p1.idade = 20;
        p1.falar();

        Professor p2 = new Professor();
        p2.nome = "Cris";
        p2.idade = 32;
        p2.materia = "POO";
        p2.falar();
        p2.ministrarAula();

        Faculdade f1 = new Faculdade();
        f1.nome = "inatel";
        f1.professor.nome = p2.nome;
        f1.professor.idade = p2.idade;

        f1.ministrarAulas();
    }
}
