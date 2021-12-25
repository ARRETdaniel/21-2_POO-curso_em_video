public class ProjetoYouTube {
  public static void main(String[] args) {
    Video v[] = new Video[3];
    v[0] = new Video("Aula 1");
    v[1] = new Video("Aula 2");
    v[2] = new Video("Aula 3");

    Gafanhoto g[] = new Gafanhoto[3];
    g[0] = new Gafanhoto("Da", 22, "M", "Dada");

    Visualizacao vis = new Visualizacao(g[0], v[0]);
    vis.avaliar(55.3f);
    // System.out.println(g[0].toString());
    // System.out.println(v[0].toString());
    System.out.println(vis.toString());
  }
}
