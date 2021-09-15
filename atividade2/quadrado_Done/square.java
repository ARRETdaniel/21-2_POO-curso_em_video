public class square {
  protected double side;
  protected double area;

  public void sideValue() {
    System.out.println("\n -----------");
    System.out.println("\n side value:" + this.side);
    System.out.println("\n area value:" + this.area);
    System.out.println("\n -----------");

  }

  public void changeSides(double newSide) { // metodo
    side = newSide;

  }

  public void areaValue() {
    // Area of Square = side*side
    area = side * side;
  }
}
