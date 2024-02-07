package treinando.devdojo.maratonajava.exercicio.estruturas;

public class L1Ex21 {
    public static void main(String[] args) {
        Odd odd = new Odd();
        int[] lista = new int[]{1,2,33,4,56, 101, 999, 1002};
        odd.numberOdd(lista);
    }
}

class Odd {
    public void numberOdd(int[] n){
        for (int i = 0; i < n.length; i++){
            if(n[i] % 2 == 1){
                System.out.print(" " + n[i]);
            }
        }
    }

}

