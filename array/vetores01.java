package treinando.devdojo.maratonajava.exercicio.estruturas;

import java.util.Scanner;

public class vetores01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numAlunos = 5;
        double[] notasAlunos = new double[numAlunos];

        for(int i = 0; i < numAlunos; i++){
            System.out.println("Insira a nota: " + (i+1) + " aluno");
            notasAlunos[i] = input.nextDouble();
        }

    }
}
