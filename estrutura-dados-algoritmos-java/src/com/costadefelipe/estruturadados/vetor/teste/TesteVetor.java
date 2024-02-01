package com.costadefelipe.estruturadados.vetor.teste;

import com.costadefelipe.estruturadados.vetor.dominio.Vetor;

public class TesteVetor {
    public static void main(String[] args){
        Vetor vetor = new Vetor(10);

        vetor.add("Ruth");
        vetor.add("Levi");
        vetor.add("Jesus");
        vetor.add("Felipe");

        System.out.println(vetor.busca(0));
        System.out.println(vetor.tamanho());
        System.out.println(vetor);
    }
}
