package treinando.devdojo.maratonajava.exercicio.estruturas;

/**
 *menor numero de array/vetor
 * **/

public class L1Ex06Array {
    public static void main(String[] args) {

        int[] numeros = {111, -1, 3333, -1, 511, -100};
        int menor = numeros[0];

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println(menor);

    }
}
