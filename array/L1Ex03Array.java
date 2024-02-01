package treinando.devdojo.maratonajava.exercicio.estruturas;

import java.util.Scanner;

public class L1Ex03Array {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int[] c;
        int tamanho;

        do {
            System.out.print("Entre com o tamanho do vetor:");
            tamanho = leia.nextInt();

            if (tamanho < 1 || tamanho > 20) {
                System.out.println("Tamanho invalido! Digite um valor entre 1 e 20");
            }
        }while(tamanho < 1 || tamanho > 20);

        c = new int[tamanho];

        for(int i = 0; i < c.length; i++){
            System.out.print("Entre com um número: ");
            c[i] = leia.nextInt();
        }

        System.out.println("Saída:");

        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
    }
}
