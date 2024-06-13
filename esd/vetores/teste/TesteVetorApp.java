package esd.vetores.teste;

import esd.vetores.dominio.Vetor;

public class TesteVetorApp {
  public static void main(String[] args) {

    Vetor vetor = new Vetor(10);

    vetor.add("elemento 1");
    vetor.add("elemento 2");
    vetor.add("elemento 3");

    System.out.println(vetor);
    vetor.remove(1);
    System.out.println(vetor);
    System.out.println(vetor.buscar("elemento 3"));
  }
}
