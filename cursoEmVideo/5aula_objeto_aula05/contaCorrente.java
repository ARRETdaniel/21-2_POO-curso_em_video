public class contaCorrente {
  public static void main(String[] args) {
    ContaBanco p1 = new ContaBanco();
    ContaBanco p2 = new ContaBanco();

    p1.setAccountNumber(1111);
    p1.setOwner("Daniel");
    p1.openAccount("CC");
    p1.deposit(100);
    p1.deposit(100);
    p1.withdraw(100);
    p1.currentState();

    //p1.setAccountNumber(22222);
  //  p1.setOwner("eeee");
   // p1.openAccount("CP");
   // p1.currentState();
 // System.out.println("\n -- Balence: " + getBalance());
  }
}
