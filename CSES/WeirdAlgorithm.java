public class WeirdAlgorithm {
    public static void main(String[] args){
        
        int n = 3;

        while( n != 1){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = (n * 3) + 1;
            }
            System.out.print(" " + n);
        }

    }
}
