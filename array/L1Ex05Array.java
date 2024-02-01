package treinando.devdojo.maratonajava.exercicio.estruturas;

import java.util.Scanner;

/**
 *Maior numero de array/vetor
 * **/

public class L1Ex05Array {
    public static void main(String[] args) {

        int[] numeros = {111, 22, 3333, 45, 511, 10_000};
        int maior = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println(maior);

    }
}
