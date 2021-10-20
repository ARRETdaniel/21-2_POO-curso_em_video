public class aula {
  public static void main(String[] args) {
    CommissionedEmployee c = new CommissionedEmployee("Mr.", "Sales", 700.0, 1.00, 10);

    System.out.println("units???: $" + c.getunits()); // teste

    c.addSales(5);
    System.out.println("First Name:" + c.getFirstName());
    System.out.println("Last Name: " + c.getLastName());
    System.out.println("Base Pay: $" + c.getWage());
    System.out.println("Total Pay: $" + c.calculatePay());

    CommissionedEmployee c1 = new CommissionedEmployee("Ms.", "Maria", 700.0, 1.00, 10);
    c1.addSales(5);
    System.out.println("---units???: $" + c1.getunits()); // teste

    c1.resetSales();
    System.out.println("---units???: $" + c1.getunits()); // teste
    System.out.println("--c---units???: $" + c.getunits()); // teste
    System.out.println("c2 Total Pay: $" + c1.calculatePay());


  }
}
