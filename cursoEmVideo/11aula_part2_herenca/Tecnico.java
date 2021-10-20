public final class Tecnico extends Aluno {
  private float registroProfissional;

  public void praticar() {
    System.out.println("O aluno " + this.getNome() + " esta praticando");
  }
  
  public float getRegistroProfissional() {
    return this.registroProfissional;
  }

  public void setRegistroProfissional(float registroProfissional) {
    this.registroProfissional = registroProfissional;
  }





}
