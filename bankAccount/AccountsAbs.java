import java.util.Random;

public abstract class AccountsAbs implements AccountCountable{
    public static int totalAccounts;
    public static double totalAmount;

    private int accountNumbers;
    private String accountType;
    private double amountInAccount;
    
    public AccountsAbs(int totalAccounts, double totalAmount, int accountNumbers, String accountType, double amountInAccount){
        totalAccounts++;
        totalAmount = getAddedAmount();
        this.accountNumbers =accountNumbers;
        this.accountType = accountType;
        this.amountInAccount = amountInAccount;

    }
    public void totalAddedAmounts(double totalAmount){
        this.totalAmount = getDeposits();
    }
    public double getAddedAmount(){
        return totalAmount;
    }

    public void setAccountNumbers(int accountNumbers){
        // Random random = new Random();
        // int random = (int)(Math.random() * 50 + 1);
        this.accountNumbers = accountNumbers;
    }
    public int getAccountNumber(){
        return accountNumbers;
    }
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    public void setDeposit(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public double getDeposits(){
        return totalAmount;
    }
}