public class NormalDepositAccount extends DepositAccount{
    public NormalDepositAccount(String firstName, String lastName, String ID) {
        super(firstName, lastName, ID);
    }

    @Override
    public void annualFee() {
        this.withdrawal(300);
        System.out.println("The normal Deposit account took $300 from your account for the annual fee. Now your account left $" + this.checkAccount());
    }
}
