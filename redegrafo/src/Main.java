package redegrafo.src;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

    Usuario user1 = new Usuario("Pedro");
    Usuario user2 = new Usuario("Colombo");
    Usuario user3 = new Usuario("Tesla");
    Usuario user4 = new Usuario("Viktor Frankl");

    //criar o grafo;
    HashMap<Usuario, HashSet<Usuario>> amigos = new HashMap<>();
    amigos.put(user1, new HashSet<>());
    amigos.put(user2, new HashSet<>());
    amigos.put(user3, new HashSet<>());
    amigos.put(user4, new HashSet<>());

    //adionar relacionamento;
    amigos.get(user1).add(user4);
    amigos.get(user4).add(user1);
    amigos.get(user4).add(user2);
    amigos.get(user3).add(user2);
    amigos.get(user3).add(user4);
    amigos.get(user3).add(user1);

    if (amigos.get(user4).contains(user1)) {
      System.out.println("Viktor e Pedro são amigos");
    } else {
      System.out.println("Viktor e Pedro não são amigos");
    }
  }
}
