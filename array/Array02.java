package treinando.devdojo.maratonajava.exercicio.estruturas;

public class Array02 {
    public static void main(String[] args) {

        int numeros[] = new int[4]; //declaração e dando o tamanho do array;

        numeros[0] = 7;
        numeros[1] = 53;
        numeros[2] = 22;
        numeros[3] = 17;

        for(int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }

        System.out.println("\n");

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
