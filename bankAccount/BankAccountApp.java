import comPa.BankAccount;

public class BankAccountApp{
    public static void main(String[] args) {
        Account jamesAccount = new Account();
        System.out.println(jamesAccount.getAccounNumber());
        jamesAccount.setCheckingBalance(100.25);
        jamesAccount.setSavingsBalance(100.25);
        //read
        System.out.println(
           "Starting Balance"+jamesAccount.getCheckingBalance() +"\n"+
           jamesAccount.getSavingsBalance()

        );
        jamesAccount.depositCashChecking(100);
        jamesAccount.depositCashSavings(100);
        //read
        System.out.println(
            "Checking Balance after deposit: $" +jamesAccount.getCheckingBalance() +"\n"+
            jamesAccount.getSavingsBalance()

        );
        jamesAccount.withDrawCashChecking(100.25);

        //read
        System.out.println(
           "Checking Balance after withdraw: $"+jamesAccount.getCheckingBalance() +"\n"+
           jamesAccount.getSavingsBalance()

        );
        jamesAccount.getTotalMoney(jamesAccount);
        System.out.println(Account.totalBalance(jamesAccount));
       
        
    }
}