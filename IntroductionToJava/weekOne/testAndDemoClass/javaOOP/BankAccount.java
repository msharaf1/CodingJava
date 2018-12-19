import java.util.Random;


public class BankAccount{
  private int accountNumber;
  private Double checkingBalance;
  private Double savingBalance;

  Random myRandDigits = new Random(10);

  private static int numbrerOfAccount=0;
  private static Double totalMoneyinAccounts=0;

  private String randTen(int accountNumber){
    this.accountNumber = myRandDigits.nextInt();
    return accountNumber;
  }



}
