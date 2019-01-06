import java.util.Random;

public abstract class AccountsAbs implements AccountCountable{
    public static int totalAccounts;
    public static double totalAmount;

    public abstract void totalOpenedAccounts(int counts);
    public abstract void totalAddedAmounts(double amount);

}