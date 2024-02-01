package treinando.devdojo.maratonajava.exercicio.estruturas;

public class L1Ex13ContadorDeLetras {
    public static void main(String[] args) {

        String nome = "word";
        int soma = 0;

        for(int i = 0; i < nome.length(); i++){
            if(nome.charAt(i) == 'e'){
                soma++;
            }
        }
        System.out.println(soma);
    }
}
