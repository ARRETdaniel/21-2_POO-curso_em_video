public class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  // protected int carga;
  protected boolean tampada;

  public Caneta(String modelo, String cor, float ponta) { // constuctir name
    this.modelo = modelo;
    this.cor = cor;
    this.setPonta(ponta); //
    this.tampar();

  }



  public String getModelo() {
  return this.modelo;
  }

  public void setModelo(String m) {
    this.modelo = m;
  }

  public float getPonta() {
    return this.ponta;
  }

  public void setPonta(float p) {
    this.ponta = p;
  }

  public boolean tampar() {
    return this.tampada = true;
  }

  public boolean destampar() {
    return this.tampada = false;
  }

  public void status() {
    System.out.println("\n -----------");
    System.out.println("\nmodelo: " + this.modelo);
    System.out.println("\n Uma caneta: " + this.cor);
    System.out.println("\n Esta tampada? " + this.tampada);
    System.out.println("\nPonta: " + this.ponta);
  //  System.out.println("\n Carga:" + this.carga);
    System.out.println("\n -----------");

  }
  /*
   * public void status() { System.out.println("\n -----------");
   * System.out.println(" modelo: " + this.modelo);
   * System.out.println("\n Uma caneta: " + this.cor);
   * System.out.println(" Esta tampada? \n" + this.tampada);
   * System.out.println("\n Ponta: " + this.ponta); System.out.println("\n Carga:"
   * + this.carga); System.out.println("\n -----------");
   *
   * }
   *
   * public void rabiscar() { // metodo if (this.tampada == true) {
   * System.out.println("\n ERRO! Nao posso rabiscar"); } else {
   * System.out.println("\n Estou rabiscando"); }
   *
   * }
   *
   * private void tampar() { this.tampada = true; }
   *
   * private void destampar() { this.tampada = false; }
   */
}

public class Caneta {
  //variaveis
  //Metodos
  //set and get
  //contructor
  //...
}
