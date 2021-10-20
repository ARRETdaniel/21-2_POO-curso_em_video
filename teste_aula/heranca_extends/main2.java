public class main2 {
  public static void main(String[] args) {
    ThreeDimensionalPoint p1 = new ThreeDimensionalPoint(12, 12, 2);
    TwoDimensionalPoint p2 = new TwoDimensionalPoint(16, 16);
    Line l = new Line(p1, p2);
    //testes
    TwoDimensionalPoint mid = l.getMidpoint();

    //testes
    //testes
    System.out.println("Midpoint: (" + mid.getXCoordinate() + "," + mid.getYCoordinate() + ")");
    System.out.println("Distance: " + l.getDistance()); //ll
    //testes
    //testes
  }

}
