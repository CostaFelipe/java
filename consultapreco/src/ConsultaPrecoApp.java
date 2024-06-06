package consultapreco.src;

import java.util.Scanner;

public class ConsultaPrecoApp {

  private static Produto[] produtos = {
    new Produto("Bolo de Cenoura 500g", 16.88, "789646300222"),
    new Produto("barra de chocolate lacta 200g", 10.88, "7896463003333"),
    new Produto("Guaraná lata", 5.99, "789643100222"),
    new Produto("carne do sol 500g", 38.28, "789111199888")
  };

  public static void main(String[] args) {
    System.out.print("informe o código de barras:");
    Scanner scan = new Scanner(System.in);

    String codigoBarrasInformado = scan.nextLine();
    Produto produtoEncontrado = procurarProduto(codigoBarrasInformado);

    if (produtoEncontrado != null) {
      System.out.println(produtoEncontrado.getProduto());
    } else {
      System.out.println("Produto não encontrado");
    }

  }

  private static Produto procurarProduto(String codigoBarras) {
    for (Produto produtoAtual : produtos) {
      if (produtoAtual.getCodigoBarras().equals(codigoBarras)) {
        return produtoAtual;
      }
    }
    return null;
  }
}
