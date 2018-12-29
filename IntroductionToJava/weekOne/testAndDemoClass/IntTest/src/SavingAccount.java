public class SavingAccount extends BankAccount {

    public SavingAccount(String name, long amount){
        super("saving", amount);
    }

    @Override
    public void depositAmount(long amount) {
        super.depositAmount(amount);
    }
}
