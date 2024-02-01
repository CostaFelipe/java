package treinando.devdojo.maratonajava.exercicio.estruturas;

import java.util.Scanner;

public class L1Ex12LoopAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <= 2 * n + 1; i+=2){
            System.out.print(i + " ");
        }
    }
}
