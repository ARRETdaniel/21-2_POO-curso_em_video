public class ContaBanco {
  public int accountNumber;
  protected String tipy;
  
  private double balance;

  protected void status() {
    System.out.println("\n Balence: " + getBalance());
    System.out.println("\n Holder name: " + this.holderName);
  }

  public checkingAccount(int balance) { // contructor
    if (holderName != null) {
      System.out.println("\n This account has already been created.");
      return;
    } else {
      this.holderName = "Maria";
      this.balance = 10;
    }
  }
  // if (age < 21) {
  // grown = (age * 0.5);
  // }

  protected void setChangeName(String holderName) {
    this.holderName = holderName;
  }

  protected void setDeposit(double balance) {
    this.balance += balance;
  }

  protected void withDrawal(double balance) {
    this.balance -= balance;
  }

  protected double getBalance() {
    return balance;
  }

}
