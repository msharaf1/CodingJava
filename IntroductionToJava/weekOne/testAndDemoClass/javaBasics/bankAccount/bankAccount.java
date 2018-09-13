import java.util.Random;

public class BankAccount{
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    public static int numberOfCreatedAccounts = 0;
    public static double totalAmountStored = 0;

    private randAccountNumber(){
        Random randNumber = new Random();
        int accountNumber = rand.nextInt(50) + 1;
    }

}