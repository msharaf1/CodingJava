public class CheckingAmount extends BankAccount{

    public CheckingAmount(long amount){
        super("checking", amount);
    }

    public void withdDraw(long amount){
        setAmount ( getAmount ()- amount );
    }
}
