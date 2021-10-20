public class aula7 {
  public static void main(String[] args) {
   Lutador L[] = new Lutador[6];
    L[0] = new Lutador("pretty boy", "France", 31, 1.75f, 68.9f, 11, 2, 1);
   // L[1] = new Lutador();
   // L[2] = new Lutador();
   // L[3] = new Lutador();
   // L[4] = new Lutador();
   // L[5] = new Lutador();

    L[0].apresentar();
    L[0].status();
  }
}
