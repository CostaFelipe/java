package esd.vetores.dominio;

public class Vetor {
  private String[] elementos;
  private int tamanho;

  public Vetor(int capacidade) {
    this.elementos = new String[capacidade];
    this.tamanho = 0;
  }

  //versão final
  public boolean add(String elemento) {
    if (this.tamanho < elementos.length) {
      this.elementos[this.tamanho] = elemento;
      this.tamanho++;
      return true;
    }
    return false;
  }

  public int buscar(String elemento) {
    for (int i = 0; i < elementos.length; i++) {
      if (this.elementos[i].equals(elemento)) {
        return i;
      }
    }
    return -1;
  }

  public String buscar(int posicao) {
    if (!(posicao >= 0 && posicao < this.tamanho)) {
      throw new IllegalArgumentException("Posição inválida");
    }
    return this.elementos[posicao];
  }

  public void remove(int posicao) {
    if (!(posicao >= 0 && posicao < this.tamanho)) {
      throw new IllegalArgumentException("Posição Inválida");
    }

    for (int i = posicao; i < tamanho - 1; i++) {
      this.elementos[i] = this.elementos[i + 1];
    }

    this.tamanho--;
  }

  public void remove(String elemento) {
    int pos = this.buscar(elemento);
    if (pos > -1) {
      this.remove(pos);
    }
  }


  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("[");

    for (int i = 0; i < this.tamanho - 1; i++) {
      s.append(this.elementos[i]);
      s.append(", ");
    }

    if (this.tamanho > 0) {
      s.append(this.elementos[this.tamanho - 1]);
    }

    s.append("]");

    return s.toString();
  }
}
