package esd.vetores.teste;

import esd.vetores.dominio.Vetor;

public class TesteVetorApp {
  public static void main(String[] args) {

    Vetor vetor = new Vetor(10);

    vetor.add("João");
    vetor.add("Maria");
    System.out.println(vetor);
  }
}
