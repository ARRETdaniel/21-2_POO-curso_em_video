public class Livro implements publicacao {
  private String titulo;
  private String autor;
  private int totPaginas;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;

  public String detalhes() {
    return "{" + " titulo='" + getTitulo() + "'" + ", autor='" + getAutor() + "'" + ", totPaginas='" + getTotPaginas()
        + "'" + ", pagAtual='" + getPagAtual() + "'" + ", aberto='" + isAberto() + "'" + ", leitor='" + leitor.getName()
        + ", sexo='" + leitor.getSexo()
        + ", idade='" + leitor.getIdade()
        + "'" + "}";
  }

  public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
    this.titulo = titulo;
    this.autor = autor;
    this.totPaginas = totPaginas;
    this.aberto = false;
    this.pagAtual = 0;
    this.leitor = leitor;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTotPaginas() {
    return this.totPaginas;
  }

  public void setTotPaginas(int totPaginas) {
    this.totPaginas = totPaginas;
  }

  public int getPagAtual() {
    return this.pagAtual;
  }

  public void setPagAtual(int pagAtual) {
    this.pagAtual = pagAtual;
  }

  public boolean isAberto() {
    return this.aberto;
  }

  public boolean getAberto() {
    return this.aberto;
  }

  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public Pessoa getLeitor() {
    return this.leitor;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  @Override
  public void abrir() {
    this.aberto = true;
  }

  @Override
  public void fechar() {
    this.aberto = false;
  }

  @Override
  public void folhear(int p) {
    if (p > this.totPaginas) {
      this.pagAtual = 0;
    } else {
      this.pagAtual = p;
    }
  
  }

  @Override
  public void avancarPag() {
    this.pagAtual++;
  }

  @Override
  public void voltarPag() {
    this.pagAtual--;
  }

}
