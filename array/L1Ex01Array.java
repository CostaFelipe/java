package treinando.devdojo.maratonajava.exercicio.estruturas;

import java.util.Scanner;

public class L1Ex01Array {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int[] numeros = new int[15];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero[" + (i+1) + "/15]: ");
            numeros[i] = read.nextInt();
        }

        System.out.println("\n");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(" " + numeros[i]);
        }
    }
}
