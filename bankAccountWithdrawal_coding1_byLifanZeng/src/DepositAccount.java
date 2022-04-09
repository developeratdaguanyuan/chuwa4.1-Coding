abstract class DepositAccount implements BankAccount{
    private String firstName;
    private String LastName;
    private String ID;
    public int moneyInAccount;

    DepositAccount(String firstName, String LastName, String ID){
        this.firstName = firstName;
        this.LastName = LastName;
        this.ID = ID;
    }

    @Override
    public void openAccount(int moneyToOpenAccount){
        moneyInAccount = moneyToOpenAccount;
    }

    @Override
    public void cancelAccount() {
        System.out.println("The account has been canceled！");
    }

    public void deposit(int moneyToDeposit){
        moneyInAccount = moneyToDeposit + moneyInAccount;
    }

    public void withdrawal(int moneyToDeposit2){
        moneyInAccount = moneyInAccount - moneyToDeposit2;
    }

    public int checkAccount(){
        return moneyInAccount;
    }

    public String getFirstName(){
        return firstName;
    }

    abstract public void annualFee();

}
