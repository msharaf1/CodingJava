import java.util.Random;

public abstract class AccountsAbs implements AccountCountable{
    public static int totalAccounts;
    public static double totalAmount;

    public int accountNumbers;
    private String accountType;
    private double amountInAccount;
    
    public AccountsAbs(int totalAccounts, double totalAmount, int accountNumbers, String accountType, double amountInAccount){
        totalAccounts++;
        // totalAmount = getAddedAmount();
        this.accountNumbers =accountNumbers;
        this.accountType = accountType;
        this.amountInAccount = amountInAccount;

    }
    public abstract void totalAddedAmounts(double totalAmount);

    public abstract void setAccountNumbers(int accountNumbers);
    


    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    public String getAccountType(){
        return accountType;
    }

    public void setDeposit(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public double getDeposits(){
        return totalAmount;
    }

}