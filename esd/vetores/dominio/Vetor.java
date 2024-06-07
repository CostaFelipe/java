package esd.vetores.dominio;

public class Vetor {
  private String[] elementos;
  private int tamanho;

  public Vetor(int capacidade) {
    this.elementos = new String[capacidade];
    this.tamanho = 0;
  }

  //primeira versão
  public void primeiroadd(String elemento) {
    for (int i = 0; i < this.elementos.length; i++) {
      if (this.elementos[i] == null) {
        this.elementos[i] = elemento;
        break;
      }
    }
  }

  //segunda versão
  public void segundoAdd(String elemento) throws Exception {
    if (this.tamanho < this.elementos.length) {
      this.elementos[this.tamanho] = elemento;
      this.tamanho++;
    } else {
      throw new Exception("Vetor está cheio, não é possível adicionar mais");
    }
  }

  //versão final
  public boolean add(String elemento){
    if (this.tamanho < elementos.length) {
      this.elementos[this.tamanho] = elemento;
      this.tamanho++;
      return true;
    }
    return false;
  }
}
