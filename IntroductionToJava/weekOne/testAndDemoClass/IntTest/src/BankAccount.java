public class BankAccount {
    private String name;
//    private long account;
    private long amount;

    public BankAccount(String name, long amount){
        this.name =name;
//        this.amount= amount;
        setAmount(amount);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void depositAmount(long amount){
        this.amount += amount;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public long getAmount() {
        return amount;
    }


}//class
