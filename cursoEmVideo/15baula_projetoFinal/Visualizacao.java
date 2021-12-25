public class Visualizacao {
  private Gafanhoto espectator;
  private Video filme;

  public Visualizacao(Gafanhoto espectator, Video filme) {
    this.espectator = espectator;
    this.filme = filme;
    this.espectator.setTotAssistido(this.espectator.getTotAssistido() + 1);
    this.filme.setViews(this.filme.getViews() + 1);
  }

  public void avaliar() {
    this.filme.setAvaliacao(5);
  }

  public void avaliar(int nota) {
    this.filme.setAvaliacao(nota);
  }

  public void avaliar(float porc) {
    int tot = 0;
    if (porc <= 20) {
      tot = 3;
    } else if (porc <= 50) {
      tot = 5;
    } else if (porc <= 90) {
      tot = 8;
    } else {
      tot = 10;
    }
    this.filme.setAvaliacao(tot);
  }

  public Gafanhoto getEspectator() {
    return this.espectator;
  }

  public void setEspectator(Gafanhoto espectator) {
    this.espectator = espectator;
  }

  public Video getFilme() {
    return this.filme;
  }

  public void setFilme(Video filme) {
    this.filme = filme;
  }

  @Override
  public String toString() {
    return "{" +
        " espectator='" + getEspectator() + "'" +
        ", filme='" + getFilme() + "'" +
        "}";
  }

}
