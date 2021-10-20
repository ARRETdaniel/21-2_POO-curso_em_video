public class aula10 {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();

    p2.setNome("1111");
    p2.setSexo("2sexo");
    p2.setIdade(22);
    System.out.println(p2.getNome());
    System.out.println(p2.toString());

  }

}
