public class ContaBanco {
  public int accountNumber;
  protected String type;
  private String owner;
  private double balance;
  private boolean status;

  public void currentState() {
    System.out.println("\n -----------");
    System.out.println(" account: " + this.getAccountNumber());
    System.out.println(" type: " + this.getType());
    System.out.println("\n Owner: " + this.getOwner() );
    System.out.println(" balance \n" + this.getBalance());
    System.out.println("\n status: " + this.getStatus());
   // System.out.println("\n Carga:" + this.carga);
    System.out.println("\n -----------");
  }

  public void openAccount(String type) {
    this.setType(type);
    this.setStatus(true);
    if (type == "CC") {
      this.setBalance(50);
    } else if (type == "CP") {
      this.setBalance(150);
    }
    System.out.println("\nOpen account.");
  }

  public void closeAccount() {
    if (this.getBalance() > 0) {
      System.out.println("Money in account.");
    } else if (this.getBalance() < 0) {
      System.out.println("Negative belance. U can close ur account");
    } else {
      this.setStatus(false);
      System.out.println("account closed successfully");
    }
  }

  public void deposit(float balance) {
    if (getStatus()) {
      //this.balance += balance;
      setBalance(getBalance() + balance);
      System.out.println("sucessful deposit in: " + getOwner());
    } else {
      System.out.println("insucessful deposit");
    }


  }

  public void withdraw(float balance) {
    if (this.getStatus()) {
        if (getBalance() >= balance) {
          System.out.println("Sucessful withdraw from:" + getOwner());
        } else {
          System.out.println("Insufficient funds");
        }
      } else {
      System.out.println("Account do not exist");
    }
  }

  public void fee() {
    int v = 0;
    if (this.getType() == "CC") {
      v = 12;
    } else if (this.getType() == "CP") {
      v = 20;
    }
    if (getStatus()) {
      this.setBalance(this.getBalance() - v);
      System.out.println("Fee successfully paid by:" + getOwner());
    } else {
      System.out.println("Account do not exist");
    }
  }

  // especial met


  public ContaBanco() {
    setBalance(0);
    setStatus(false);
  }


  public int getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getOwner() {
    return this.owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return this.balance;
  }
  public boolean isStatus() {
    return this.status;
  }

  public boolean getStatus() {
    return this.status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }




////////////////////////////////////////////////////

}
