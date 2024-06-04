package armazenaaluno.src;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Aluno> alunos = new ArrayList<>();

    alunos.add(new Aluno("Maria", 25, 9.0));
    alunos.add(new Aluno("Pedro", 21, 9.0));
    alunos.add(new Aluno("Estevão", 25, 8.5));

    display(alunos);

  }

  public static void display(ArrayList<Aluno> alunos) {
    for (Aluno aluno : alunos) {
      System.out.println("Nome: " + aluno.nome);
      System.out.println("Idade: " + aluno.idade);
      System.out.println("Nota: " + aluno.nota);
      System.out.println("---------------------");
    }
  }
}
