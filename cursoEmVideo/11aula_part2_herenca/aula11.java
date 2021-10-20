public class aula11 {
  public static void main(String[] args) {
    // Pessoa p1 = new Pessoa();
    // Pessoa p1 = new Pessoa();
    // Aluno p2 = new Aluno();
    // Professor p3 = new Professor();
    // Funcionario p4 = new Funcionario();
    // Pessoa p5 = new P
    Visitante v1 = new Visitante();
    v1.setNome("TErra");
    System.out.println(v1.toString());

    Aluno p2 = new Aluno();
    p2.setSexo("2sexo");
    p2.setIdade(22);
    p2.setNome("Daniel");
    p2.setCurso("info");
    p2.pagarMensalidade();
    System.out.println(p2.toString());

    Bolsista b1 = new Bolsista();
    b1.setSexo("sex");
    b1.setIdade(22);
    b1.setNome("goimes");
    b1.setCurso("bio");
    b1.setBolsa(12.5f);

    System.out.println(b1.toString());
    b1.pagarMensalidade();

    Tecnico t1 = new Tecnico();
    t1.setNome("boytecn");
    t1.praticar();
    // System.out.println(p2.getNome());

  }

}
