package treinando.devdojo.maratonajava.exercicio.estruturas;

public class Array01 {
    public static void main(String[] args) {

        int numeros[] = new int[4]; //declaramos no primeiro momento e depois damos o tamanho desse array(dimensionamos)
        //ou
        // int numeros[];
        // numberos = new int[4];

        numeros[0] = 17;
        numeros[1] = 22;
        numeros[2] = 53;
        numeros[3] = 7;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);

    }
}
