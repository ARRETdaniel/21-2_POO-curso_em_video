public class Lutador {
  // atributos
  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  private int vitoria, derrotas, empates;

  // metodos publicos
  public void apresentar() {
    System.out.println("------------------------------------");
    System.out.println(" Lutador:" + this.getNome() + "nacionalidade:" + this.getNacionalidade() + "idade:" + getIdade() +
    + this.getIdade() + "altura:" + this.getAltura() + "peso:" + this.getPeso() + " vitorias" + this.getVitoria() +
    "derrotas" + this.getDerrotas() + "empates" + this.getEmpates());
    System.out.println("------------------------------------");
  }

  public void status() {
    System.out.println("------------------------------------");
    System.out.println("nome:" + this.getNome() + "categoria" + this.getCategoria() + "ganhou" + this.getVitoria() + "perder" + this.getDerrotas()
    + "empates " + this.getEmpates()  );
    System.out.println("------------------------------------");
  }

  public void ganharLutar() {
    this.setVitoria(this.getVitoria() + 1);
  }

  public void perderLutar() {
    this.setDerrotas(this.getDerrotas() + 1);
  }

  public void empaterLuta() {
    this.setEmpates(this.getEmpates() + 1);
  }

  public Lutador(String nome, String nacionalidade, int idade,
   float altura, float peso, int vitoria, int derrotas, int empates) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
    this.setPeso(peso);
    this.vitoria = vitoria;
    this.derrotas = derrotas;
    this.empates = empates;
  }

  // Metodos especias

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNacionalidade() {
    return this.nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public float getAltura() {
    return this.altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public float getPeso() {
    return this.peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
    this.setCategoria();
  }

  public String getCategoria() {
    return this.categoria;
  }

  private void setCategoria() {
    if (this.peso < 52.2) {
      this.categoria = "invaliudo";
      }else if (this.peso <= 70.3) {
      this.categoria = "leve";
      }else if (this.peso <= 83.9) {
      this.categoria = "medio";
      }else if (this.peso <= 120.2) {
      this.categoria = "pesado";
      } else {
      this.categoria = "invaliudo";
      }
  }

  public int getVitoria() {
    return this.vitoria;
  }

  public void setVitoria(int vitoria) {
    this.vitoria = vitoria;
  }

  public int getDerrotas() {
    return this.derrotas;
  }

  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  public int getEmpates() {
    return this.empates;
  }

  public void setEmpates(int empates) {
    this.empates = empates;
  }


}
