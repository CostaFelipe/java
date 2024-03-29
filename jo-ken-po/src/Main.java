import java.util.Scanner;

public class Main {

    public static JoKenPo startGame(){
        System.out.println("****** Jo-Ken-Po ******\n");
        Scanner scann = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String playerName = scann.next().toUpperCase();

        Player player = new Player(playerName);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}