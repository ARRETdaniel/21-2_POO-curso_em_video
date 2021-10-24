  public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    // metodos de animal
    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirsom();


  public float getPeso() {
    return this.peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getMembros() {
    return this.membros;
  }

  public void setMembros(int membros) {
    this.membros = membros;
  }

}
