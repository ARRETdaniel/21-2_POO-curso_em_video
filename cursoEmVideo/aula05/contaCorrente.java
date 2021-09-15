public class contaCorrente {
  public static void main(String[] args) {
    checkingAccount checkingAccount1 = new checkingAccount();

    checkingAccount1.constructer();

    checkingAccount1.status();
    checkingAccount1.setDeposit(1000);
    checkingAccount1.status();
    checkingAccount1.withDrawal(500);
    checkingAccount1.setChangeName("Joaozinho");
    checkingAccount1.constructer();
    checkingAccount1.status();
    checkingAccount1.constructer();
    System.out.println("\n Numberaccou: " + checkingAccount1.balance);
    // System.out.println("\n -- Balence: " + getBalance());
  }
}
