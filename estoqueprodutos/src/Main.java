package estoqueprodutos.src;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    HashMap<String, Produto> estoque = new HashMap<>();
    estoque.put("Camiseta", new Produto("Camiseta", 100, 21.99));
    estoque.put("Suco de laranja 1L", new Produto("Suco de laranja 1L", 0, 5.99));
    estoque.put("Sapato", new Produto("Sapato", 10, 80.00));

    produtoEstoque("Suco de laranja 1L", estoque);

  }

  public static void produtoEstoque(String nomeProduto, HashMap<String, Produto> estoque) {
    if (estoque.containsKey(nomeProduto)) {
      Produto produto = estoque.get(nomeProduto);
      System.out.println("Quantidade em estoque: " + produto.quantidade);
    } else {
      System.out.println("Produto não encontrado no estoque.");
    }
  }
}
