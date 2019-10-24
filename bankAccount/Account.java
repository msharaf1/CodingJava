import java.util.Random;

public class Account{
    //(string) account number, (double) checking balance, (double) savings balance.
    private String accounNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int totalOpenedAccounts = 0;
    private static double totalBalance =0.00;


    //constructor
    public Account(){
        this.accounNumber = getRandomNumbers();
        this.totalOpenedAccounts++;
    }
    public String getRandomNumbers(){
        Random random = new Random();
        String strInts = "";
        // String strLongs = "";
        for(int i = 1; i <= 10; i++){
            strInts += ((int)random.nextInt(10));
            // strLongs += ((long)random.nextInt(10));
        }
        // Integer randInt = Integer.valueOf(strInts);
        // Long randLong = Long.parseLong(strLongs);
        // int x = randLong.intValue();
        // System.out.println(x);

        // return randLong;
        return strInts;
    }
    
    // private static String genAccountNum(){
    //     return Integer.toString(rand.nextInt(1000000000)+1000000000);
    // }
    

    public String getAccounNumber() {
        return this.accounNumber;
    }

    public void setAccounNumber(String accounNumber) {
        this.accounNumber = accounNumber;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getTotalOpenedAccounts(){
        return totalOpenedAccounts;
    }
    public static double getTotalBalance(){
        return totalBalance;
    }
//add money
    public String depositCashChecking(double cash){
        this.setCheckingBalance(this.getCheckingBalance() + cash);
        return "You added $" +cash +", your current balance is $"+this.getAccounNumber();
    }

    public String depositCashSavings(double cash){
        this.setSavingsBalance(this.getSavingsBalance() + cash);
        return "You added $" +cash +", your current balance is $"+this.getAccounNumber();
    }

    public String withDrawCashChecking(double cash){
        if(cash > this.getCheckingBalance()){
            System.out.println("There is no sufficient ("+ this.getCheckingBalance() +") balance in your account");
            return "There is no sufficient ("+ this.getCheckingBalance() +") balance in your account";
        }
        // else if(cash <= this.getCheckingBalance()){
        // } 
        this.setCheckingBalance(this.getCheckingBalance() - cash);
        return "You added $" +cash +", your current balance is $"+this.getAccounNumber();

    }

    public String withDrawCashSavings(double cash){
        if(cash > this.getSavingsBalance()){
            return "There is no sufficient ("+ this.getSavingsBalance() +") balance in your account";
        }
        this.setSavingsBalance(this.getSavingsBalance() - cash);
        return "You added $" +cash +", your current balance is $"+this.getAccounNumber();
    }

    public void getTotalMoney(Account account){
        double total = account.checkingBalance + account.savingsBalance;
        double receivedTotal = account.getCheckingBalance() +account.getSavingsBalance();
        double testTotal = getCheckingBalance() + getSavingsBalance();
        System.out.println("Total from Account.Ch is : $"+total
        +"\n"+
        "Received Total is acc.getCheck: $"+receivedTotal +"\n"+
        "testTotal is : $"+testTotal
        ); 
    }

    public static double totalBalance(Account account){
        return totalBalance = account.checkingBalance + account.savingsBalance;
         
    }

}