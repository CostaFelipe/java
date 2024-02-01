public class Ordenar {

    public static void main(String[] args){
        Ordenacao ord = new Ordenacao();
        int[] array = new int[]{14,6,-1,8,3,-10};
        ord.ordenar(array);
    }

}

class Ordenacao {
    public void ordenar(int[] n){
        for(int i = 0; i < n.length; i++){
            for(int j = i + 1; j < n.length; j++){
                if(n[i] > n[j]){
                    int aux = n[i];
                    n[i] = n[j];
                    n[j] = aux;
                }
            }
            System.out.print(" " + n[i]);
        }
    }
}
