public final class Bolsista extends Aluno {
  private float bolsa;

  public void renovarBolsa() {
    System.out.println("Renovando bolsa de:" + this.getNome());
  }

  @Override
  public void pagarMensalidade() {
    System.out.println(this.getNome() + "eh bolsista. Pagamento feito com base em seu desconto");
  }

  public float getBolsa() {
    return this.bolsa;
  }

  public void setBolsa(float bolsa) {
    this.bolsa = bolsa;
  }

}
