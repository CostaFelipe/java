package esd.vetores.dominio;

public class Vetor {
  private String[] elementos;

  public Vetor(int capacidade) {
    this.elementos = new String[capacidade];
  }

  //primeira versão
  public void adicionar(String elemento) {
    for (int i = 0; i < this.elementos.length; i++) {
      if (this.elementos[i] == null) {
        this.elementos[i] = elemento;
        break;
      }
    }
  }
}