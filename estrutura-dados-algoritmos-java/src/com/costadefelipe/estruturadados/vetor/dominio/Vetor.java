package com.costadefelipe.estruturadados.vetor.dominio;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean add(String elemento){
        if(this.tamanho < this.elementos.length){
            this.elementos[tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("[");

        for(int i = 0; i < tamanho - 1; i++){
            s.append(elementos[i]);
            s.append(",");
        }

        if(tamanho > 0){
            s.append(elementos[tamanho - 1]);

        }
        s.append("]");
        return s.toString();
    }
}
