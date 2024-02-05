package treinando.devdojo.maratonajava.exercicio.estruturas;

public class L1Ex20Loops {
    public static void main(String[] args) {
        Even even = new Even();
        int[] lista = new int[]{1,2,33,4,56, 101, 999, 1002};
        even.numberEven(lista);
    }
}

class Even {
    public void numberEven(int[] n){
        for (int i = 0; i < n.length; i++){
            if(n[i] % 2 == 0){
                System.out.print(" " + n[i]);
            }
        }
    }
}
