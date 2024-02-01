package treinando.devdojo.maratonajava.exercicio.estruturas;

import java.util.Scanner;

/**
 * Escreva um programa para ler um vetor D de N posições, onde N é menor ou igual a 20
 * e imprimir seus elementos. O usuário deve informar o número de posição e os elementos.
 * O programa deve validar a quantidade de posições, não permitindo que o usuário forneça
 * um valor inválido.
 * **/

public class L1Ex04Array {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int d[], n;


        do{
            System.out.print("Digite a posições:");
            n = ler.nextInt();
            if(n < 1 || n >= 20) {
                System.out.println("Posição inválida");
            }
        }while(n < 1 || n >= 20);

        d = new int[n];

       for(int i = 0; i < d.length; i++ ){
           System.out.print("digite um número:");
           d[i] = ler.nextInt();
       }

       for(int i = 0; i < d.length; i++){
           System.out.print(d[i] + " ");
        }
    }
}
