/**
 * This class implements a simple bank account.
 * We will assume a well-behaved user.
 * 
 * @author Dr. Flatland
 * @version 12/23/2021
 */
public class BankAccount
{
  // The bank account balance
  private double balance;
    
  /**
   * Constructs a bank account with an initial 
   * balance of zero dollars.
   */
  public BankAccount()
  {
    balance = 0;
  }
  
  /**
   * Constructs a bank account where the 
   * user defines the initial balance.
   * 
   * @param initialBalance  starting balance.
   */  
  public BankAccount(double initialBalance)
  {
    balance = initialBalance;
  }
  /**
   * Return the account balance.
   * 
   * @return The account balance.
   */
  public double getBalance()
  {
    return balance;
  }
  /**
   * Add a specified amount to the account balance.
   * 
   * @param amountToDeposit  deposit amount
   */
  public void makeDeposit(double amountToDeposit)
  {
    balance = balance + amountToDeposit;
  }
  /**
   * Remove a specified amount from the 
   * account balance.
   * 
   * @param amountToWithdraw  withdrawal amount
   */
  public void makeWithdrawal(double amountToWithdraw)
  {
    balance = balance - amountToWithdraw;
  }
       
  
}
 
