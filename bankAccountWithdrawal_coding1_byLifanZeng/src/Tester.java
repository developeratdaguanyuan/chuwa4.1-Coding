/**
 * Written by Lifan Zeng on 4/9/2022
 * Week 1 assignment
 *
 * BankAccount is an interface.
 * DepositAccount is an abstract class. It implements BankAccount.
 * VIP_DepositAccount and NormalDepositAccount are all concrete classes. They extend DepositAccount.
 *
 * TooLessMoneyToOpenVIPAccountException is a self-defining Exception.
 * LimitToVIP defines the condition for triggering the TooLessMoneyToOpenVIPAccountException.
 * The exception is set in VIP_DepositAccount class, openAccount() method.
 */
public class Tester {
    public static void main(String[] args){
        //Using $200 to open an account, then deposit $1000, then withdraw $500, then pay $300 for annual fee. (200+1000-500-300 = 400)
        NormalDepositAccount normalDepositAccount = new NormalDepositAccount("Mary", "Wong", "E1234567");
        normalDepositAccount.openAccount(200);
        System.out.println("The money in "+ normalDepositAccount.getFirstName() +"'s account is $" +normalDepositAccount.checkAccount() );
        normalDepositAccount.deposit(1000);
        System.out.println("The money in "+ normalDepositAccount.getFirstName() +"'s account is $" +normalDepositAccount.checkAccount() );
        normalDepositAccount.withdrawal(500);
        System.out.println("The money in "+ normalDepositAccount.getFirstName() +"'s account is $" +normalDepositAccount.checkAccount() );
        normalDepositAccount.annualFee();
        System.out.println();

        //Using $1000 to open an account, then deposit $1000, then withdraw $500, then pay $300 for annual fee. (10000+1000-500-100 = 10400)
        VIP_DepositAccount vip = new VIP_DepositAccount("Lif", "Zeng", "E24681357");
        vip.openAccount(10000);
        System.out.println("The money in "+ vip.getFirstName() +"'s account is $" +vip.checkAccount() );
        vip.deposit(1000);
        System.out.println("The money in "+ vip.getFirstName() +"'s account is $" +vip.checkAccount() );
        vip.withdrawal(500);
        System.out.println("The money in "+ vip.getFirstName() +"'s account is $" +vip.checkAccount() );
        vip.annualFee();
        System.out.println();

        //Here is testing the Exception
        VIP_DepositAccount vipExpt = new VIP_DepositAccount("Mike", "Chen", "E20689357");
        vip.openAccount(100);
    }
}
