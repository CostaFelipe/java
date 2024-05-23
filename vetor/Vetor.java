
public class Vetor {
  public String[] elementos;
  public int tamanho;

  public Vetor(int capacidade) {
    this.elementos = new String[capacidade];
    this.tamanho = 0;
  }

  /*adicionar elementos*/
  public boolean add(String elemento) {
    if (this.tamanho < elementos.length) {
      this.elementos[tamanho] = elemento;
      this.tamanho++;
      return true;
    }
    return false;
  }

  public String display() {
    StringBuilder s = new StringBuilder();
    s.append("[");
    for (int i = 0; i < this.tamanho - 1; i++) {
      s.append(elementos[i]);
      s.append(", ");
    }

    if (this.tamanho > 0) {
      s.append(elementos[this.tamanho - 1]);
    }
    s.append("]");

    return s.toString();
  }

  public int tamanho() {
    return this.tamanho;
  }

}
