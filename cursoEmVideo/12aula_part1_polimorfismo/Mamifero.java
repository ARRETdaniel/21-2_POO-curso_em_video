public class Mamifero extends Animal {
  private String corPelo;

  @Override
  public void locomover() {
    System.out.println("correndfo");
  }

  @Override
  public void alimentar() {
    System.out.println("mamando");

  }

  @Override
  public void emitirsom() {
    System.out.println("som mamifero");

  }

  public String getCorPelo() {
    return this.corPelo;
  }

  public void setCorPelo(String corPelo) {
    this.corPelo = corPelo;
  }

}
