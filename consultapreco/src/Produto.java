package consultapreco.src;

public class Produto {

  private String nome;
  private double preco;
  private String codigoBarras;

  public Produto(String nome, double preco, String codigoBarras) {
    this.nome = nome;
    this.preco = preco;
    this.codigoBarras = codigoBarras;
  }

  public String getProduto() {
    return nome + " - " + getPrice();
  }

  private String getPrice() {
    return "R$ " + preco;
  }

  public String getCodigoBarras() {
    return codigoBarras;
  }

}
