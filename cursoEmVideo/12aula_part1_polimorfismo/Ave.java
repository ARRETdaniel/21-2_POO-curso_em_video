public class Ave extends Animal{
  private String corPena;

  @Override
  public void locomover() {
    System.out.println("Voandio");
  }

  @Override
  public void alimentar() {
    System.out.println("comendoc frutas");

  }

  @Override
  public void emitirsom() {
    System.out.println(" som  ds ave");

  }

  public void fazerNinho() {
    System.out.println(" contruiu ninhoi");

  }

  public String getCorPena() {
    return this.corPena;
  }

  public void setCorPena(String corPena) {
    this.corPena = corPena;
  }

}
