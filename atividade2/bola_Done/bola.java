public class bola {
  public String cor;
  public float circ;
  public int material;

  public void showColor() {
    System.out.println("\n -----------");

    System.out.println("\n Uma caneta: " + this.cor);

    System.out.println("\n -----------");

  }

  public void changeColor(String newColor) { // metodo
    cor = newColor;
  }


}
