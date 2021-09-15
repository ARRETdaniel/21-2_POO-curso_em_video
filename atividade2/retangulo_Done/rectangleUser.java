public class rectangleUser {
  public static void main(String[] args) {
    rectangle rectangle1 = new rectangle();

    System.out.println("\n Changes size NOW.");
    System.out.println("\n  Enter Width and Height:");
    // Scanner scanner = new Scanner(System.in);
    rectangle1.changeSides(1, 1);
    System.out.println("\n  New value added");

    rectangle1.perimeterCal();
    rectangle1.areaCal();
    rectangle1.allValues();
  }
}
