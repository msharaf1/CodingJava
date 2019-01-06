 public class CheckingAccounts extends AccountsAbs{

    public CheckingAccounts(int totalAccounts, double totalAmount, int accountNumbers, String accountType, double amountInAccount){
        super(totalAccounts, totalAmount, accountNumbers, accountType, amountInAccount);

    }
    // public void setAccountType(String accountType){
    //     setAccountType(accountType);
    // }
    // public String getAccountType(){
    //     return getAccountType();
    // }

    public void totalAddedAmounts(double totalAmount){
        totalAmount++;
    };

    @Override
    public void setAccountNumbers(int accountNumbers){
        super.accountNumbers = accountNumbers;
    };


}