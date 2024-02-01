import java.util.List;

public class BiggerNumber {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] lista = new int[]{10,2,33,4,5, 100, 999, 1000};
        System.out.println(solution.bigNumber(lista));
    }

}

class Solution {
    public int bigNumber(int[] n){
        int aux = 0;
        for(int i = 0; i < n.length; i++){
            if(n[i] > aux){
                aux = n[i];
            }
        }
        return aux;
    }
}
