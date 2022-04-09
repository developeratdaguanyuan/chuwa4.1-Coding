public class VIP_DepositAccount extends DepositAccount{
    public VIP_DepositAccount(String firstName, String lastName, String ID) {
        super(firstName, lastName, ID);
    }

    @Override
    public void openAccount(int moneyToOpenAccount){
        LimitToVIP limitToVIP = new LimitToVIP();
        try{
            limitToVIP.limitation(moneyToOpenAccount);
        }catch (TooLessMoneyToOpenVIPAccountException e){
            System.out.println(e.showMsg());
            cancelAccount();
            return;
        }

        moneyInAccount = moneyToOpenAccount;
    }

    @Override
    public void annualFee() {
        this.withdrawal(100);
        System.out.println("The VIP Deposit account took $100 from your account for the annual fee. Now your account left $" + this.checkAccount());
    }
}
