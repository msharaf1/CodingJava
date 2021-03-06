
import java.util.Random;
import java.util.*;

public class BankAccount {
    private String accountName;
    private String accountNumber;
    private double checkingBalance;
    private double savingBalance;
    public static int openedAccounts = 0;
    public static double totalAmount = 0.0;

    public BankAccount(){
//        this.accountName = accountName;
//        this.accountNumber = getRandomNumbers();
//        this.accountNumber = accountNumber;
//        this.checkingBalance = checkingBalance;
//        this.savingBalance = savingBalance;

        this. openedAccounts++;
//        this.totalAmount = getCheckingBalance()+ getSavingBalance();
    }

    //Generate Random Strings
    public String getRandomString() {
        String randomChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder rand = new StringBuilder();
        Random random = new Random();
        while (rand.length() <= 10) { // length of the random string.
            int index = (int) (random.nextFloat() * randomChars.length());
            rand.append(randomChars.charAt(index));
        }
        String randStr = rand.toString();
        return randStr;

    }

    public String getRandomNumbers(){
        Random random = new Random();
        String strInts = "";
        for(int i = 1; i <= 10; i++){
            strInts += ((int)random.nextInt(10));
        }
        return strInts;
    }

    public void setCheckingBalance(double checkingBalance){
//        this.checkingBalance = checkingBalance;
        if(checkingBalance < 0.0){
            System.out.println("You must enter a digit above 0");
        } else if ( checkingBalance > 0) {
            this.checkingBalance = getCheckingBalance() + checkingBalance;
            this.totalAmount += checkingBalance;
        }
    }
    public void setSavingBalance(double savingBalance){
        if(checkingBalance < 0.0){
            System.out.println("You must enter a digit above 0");
        } else if ( savingBalance > 0) {
            this.savingBalance = getSavingBalance() + savingBalance;
            this.totalAmount += savingBalance;
        }
    }

    public void setWithdrawChecking(double withdraw){
        if(getCheckingBalance() <= 0 || getCheckingBalance() < withdraw){
            System.out.println("You have insufficent balance to withdraw");
        }else {
            this.checkingBalance    = getCheckingBalance()- withdraw;
            this.totalAmount -= withdraw;
        }

    }

    public double getSavingBalance(){
        return this.savingBalance;
    }



    public void setAccountName(){
        this.accountName = getRandomString();
    }


    public void setAccountNumber(){
        this.accountNumber = getRandomNumbers();
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public String getAccountName(){
        return this.accountName;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public int openedAccounts(){
        return this.openedAccounts;
    }
//    public void setTotalAmount(){
//        this.totalAmount = getCheckingBalance() + getSavingBalance();
//    }

    public double getTotalAmount(){
        return this.totalAmount;
    }

}
