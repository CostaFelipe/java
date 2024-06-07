package esd.vetores.dominio;

public class Vetor {
  private String[] elementos;
  private int tamanho;

  public Vetor(int capacidade) {
    this.elementos = new String[capacidade];
    this.tamanho = 0;
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

  public void segundoAdd(String elemento) throws Exception {
    if (this.tamanho < this.elementos.length) {
      this.elementos[this.tamanho] = elemento;
      this.tamanho++;
    } else {
      throw new Exception("Vetor está cheio, não é possível adicionar mais");
    }
  }
}
