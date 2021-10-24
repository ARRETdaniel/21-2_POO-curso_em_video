public class Peixe extends Animal{
  private String corEscama;

  @Override
  public void locomover() {
    System.out.println("nadando");
  }

  @Override
  public void alimentar() {
    System.out.println("comendoc coisas");

  }

  @Override
  public void emitirsom() {
    System.out.println("peixe nao faz som ");

  }

  public void soltarBolha() {
    System.out.println("soltou uma bolha ");

  }

  public String getCorEscama() {
    return this.corEscama;
  }

  public void setCorEscama(String corEscama) {
    this.corEscama = corEscama;
  }

}
