package com.vetor;

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

  public int tamanho() {
    return this.tamanho;
  }

}
