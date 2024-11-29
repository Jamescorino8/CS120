/**
 * Driver for testing BankAccount
 * class methods.
 */
class Main {
  public static void main(String[] args) {
    
    //Test the default constructor/accessor.
    BankAccount account1 = new BankAccount();
    account1.makeDeposit(25.00);
    account1.makeDeposit(10.00);
    System.out.printf("account 1 created with balance: &%.2f%n", account1.getBalance());
    
    //Test the second constructor/accessor.
    BankAccount account2 = new BankAccount(100.00);
    account2.makeWithdrawal(25.00);
    System.out.printf("account 2's current balance: $%.2f%n", account2.getBalance());

  }
}