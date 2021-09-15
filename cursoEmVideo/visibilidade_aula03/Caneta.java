public class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  protected boolean tampada;

  public void status() {
    System.out.println("\n -----------");
    System.out.println(" modelo: " + this.modelo);
    System.out.println("\n Uma caneta: " + this.cor);
    System.out.println(" Esta tampada? \n" + this.tampada);
    System.out.println("\n Ponta: " + this.ponta);
    System.out.println("\n Carga:" + this.carga);
    System.out.println("\n -----------");

  }

  public void rabiscar() { // metodo
    if (this.tampada == true) {
      System.out.println("\n ERRO! Nao posso rabiscar");
    } else {
      System.out.println("\n Estou rabiscando");
    }

  }

  private void tampar() {
    this.tampada = true;
  }

  private void destampar() {
    this.tampada = false;
  }
}
