public class Pessoa {
  private String name;
  private int idade;
  private String sexo;

  public Pessoa(String name, int idade, String sexo) {
    this.name = name;
    this.idade = idade;
    this.sexo = sexo;
  }

  public void fazerAniver() {
    this.idade++;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getSexo() {
    return this.sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
}
