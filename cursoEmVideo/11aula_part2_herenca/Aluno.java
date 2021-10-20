public class Aluno extends Pessoa {
  private int mat;
  private String curso;

  public void cancelarMatr() {
    this.mat = 0;
  }

  public void pagarMensalidade() {
    System.out.println("Pagando mensalidade de:" + this.getNome());
  }

  public int getMat() {
    return this.mat;
  }

  public void setMat(int mat) {
    this.mat = mat;
  }

  public String getCurso() {
    return this.curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

}
