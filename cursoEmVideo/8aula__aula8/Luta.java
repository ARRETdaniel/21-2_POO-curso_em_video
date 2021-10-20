import java.util.Random;

public class Luta {
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;

  // metodos
  public void marcarLuta(Lutador l1, Lutador l2) {
    if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
      this.aprovada = true;
      this.desafiado = l1;
      this.desafiante = l2;
    } else {
      this.aprovada = false;
      this.desafiado = null;
      this.desafiante = null;
    }
  }

  public void lutar() {
    if (this.aprovada) {
      System.out.println("desafiado");
      this.desafiado.apresentar();
      System.out.println("desafiante");
      this.desafiante.apresentar();

      Random aleatorio = new Random();
      int vencedor = aleatorio.nextInt(3); // 0 1 2
      
      switch (vencedor) {
        case 0:
          System.out.println("empatou");
          this.desafiado.empaterLuta();
          this.desafiante.empaterLuta();
          break;
        case 1:
          System.out.println("viutoria do" + this.desafiado.getNome() );
          this.desafiado.ganharLuta();
          this.desafiante.perderLuta();
          break;
        case 2:
          System.out.println("viutoria do" + this.desafiante.getNome());
          this.desafiado.perderLuta();
          this.desafiante.ganharLuta();
          break;
      }

    } else {
      System.out.println("nao pde ter luta");
    }
  }

  // metodoes especias

  public Lutador getDesafiado() {
    return this.desafiado;
  }

  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }

  public Lutador getDesafiante() {
    return this.desafiante;
  }

  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }

  public int getRounds() {
    return this.rounds;
  }

  public void setRounds(int rounds) {
    this.rounds = rounds;
  }

  public boolean isAprovada() {
    return this.aprovada;
  }

  public boolean getAprovada() {
    return this.aprovada;
  }

  public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
  }

}
