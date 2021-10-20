public class Line {
  private TwoDimensionalPoint p1;
  private TwoDimensionalPoint p2;

  public Line(TwoDimensionalPoint p1, TwoDimensionalPoint p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  public TwoDimensionalPoint getEndpoint1() {
    return p1;
  }

  public TwoDimensionalPoint getEndpoint2() {
    return p2;
  }

  public double getDistance() {
    double x = Math.pow((p2.getXCoordinate() - p1.getXCoordinate()), 2);
    double y = Math.pow((p2.getYCoordinate() - p1.getYCoordinate()), 2);
    double distance = Math.sqrt(x + y);
    return distance;
  }

  public TwoDimensionalPoint getMidpoint() {
    double new_x = (p1.getXCoordinate() + p2.getXCoordinate()) / 2;
    double new_y = (p1.getYCoordinate() + p2.getYCoordinate()) / 2;
    return new TwoDimensionalPoint(new_x, new_y);
  }
}
