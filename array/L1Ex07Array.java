package treinando.devdojo.maratonajava.exercicio.estruturas;

/**
 *Escreva um programa para ler 2 vetores de dimensão n(n<=15)
 * e comparar os elementos do primeiro vetor com o segundo e
 * informar a posição em que os elementos são iguais.
 * **/

public class L1Ex07Array {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        int[] m = {1,2,3,4,11};

        int[] y = new int[5]; //{2,4,6,16}
        int soma = 0;

        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < m.length; j++){
                if(i == j){
                    soma = n[i] + m[j];
                    y[i] = soma;
                }
            }
            System.out.print(" " + y[i]);
        }
    }
}
