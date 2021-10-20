public class ThreeDimensionalPoint extends TwoDimensionalPoint {
  private double z_coord;

  public ThreeDimensionalPoint(double x, double y, double z) {
    super(x, y); // initialize the inherited attributes
    // by calling the parent constructor
    setZCoordinate(z);
  }

  public double getZCoordinate() {
    return z_coord;
  }

  public void setZCoordinate(double z) {
    z_coord = z;
  }

  public String toString() {
    return "I am a 3 dimensional point.\n" + "My x coordinate is: " + getXCoordinate() + "\n" + "My y coordinate is: "
        + getYCoordinate() + "\n" + "My z coordinate is: " + getZCoordinate();
  }
}
