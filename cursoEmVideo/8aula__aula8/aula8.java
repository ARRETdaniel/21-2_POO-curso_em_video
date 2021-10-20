public class aula8 {
  public static void main(String[] args) {
   Lutador L[] = new Lutador[6];
    L[0] = new Lutador("pretty boy", "France", 31, 1.75f, 68.9f, 11, 2, 1);
    L[1] = new Lutador("boy", "France", 31, 1.75f, 68.9f, 11, 2, 1);
   // L[2] = new Lutador();
   // L[3] = new Lutador();
   // L[4] = new Lutador();
   // L[5] = new Lutador();

   Luta UEC01 = new Luta();
   UEC01.marcarLuta(L[0], L[1]);
   UEC01.lutar();
   // L[0].apresentar();
    L[0].status();
    L[1].status();
  }
}
