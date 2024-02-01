public class SmallerNumber {
    public static void main(String[] args){
        int[] lista = new int[]{10, 2, 33, 4, -100, 100, 999, -1};
        smallerNumber(lista);
    }

    public static void smallerNumber(int[] n){
        int aux = n[0];
        for(int i = 0; i < n.length; i++){
            if(n[i] < aux){
                aux = n[i];
            }
        }
        System.out.println(aux);
    }
}

