public class Main {
    public static void main(String[] args){
        BankAccount newAccount = new BankAccount();
        BankAccount Savings = new BankAccount();

//        System.out.println(newAccount.getCheckingBalance());
        newAccount.setCheckingBalance(25.25);
        newAccount.setAccountNumber();
        newAccount.setAccountName();
            System.out.println("Initial Amount: $" + newAccount.getCheckingBalance());
            System.out.println("Account Name: " + newAccount.getAccountName());
            System.out.println("Account Number: " + newAccount.getAccountNumber());
        newAccount.setCheckingBalance(150.22);
        newAccount.setCheckingBalance(150.22);
        newAccount.setSavingBalance(600.25);

////        System.out.println(newAccount.totalAmount);


//        System.out.println("AccountName: " + newAccount.getAccountName());
//
//        System.out.println(newAccount.randNums);
//        newAccount.setTotalAmount();
        System.out.println("Number of Accounts Opened # " +newAccount.openedAccounts());
        System.out.println("Checking Account Balance: $" + newAccount.getCheckingBalance());
//        newAccount.setWithdrawChecking(250.02);
        newAccount.setWithdrawChecking(250.02);
//        newAccount.setWithdrawChecking(75.50);
        System.out.println("You Current Checking Account Balance: $" + newAccount.getCheckingBalance());
        System.out.println("You Current Checking Account Balance: $" + Math.round(newAccount.getCheckingBalance()));
        System.out.println("Saving Account: $" + newAccount.getSavingBalance());
        System.out.println("Total Balance: $" + newAccount.getTotalAmount());

    }
}
