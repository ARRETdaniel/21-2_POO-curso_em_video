public class main {
  public static void main(String[] args) {
    BaseLog log = new ScreenLog();
    EmployeeDatabaseAccessor eda = new EmployeeDatabaseAccessor(log);
    Employee emp = eda.retrieveEmployee("Employee", "Mr.");
  }
}
