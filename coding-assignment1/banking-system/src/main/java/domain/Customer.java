package domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    //private Account account;
    private List<Account> accounts;


    public Customer(String f,String l){
        firstName = f;
        lastName = l;
        accounts = new ArrayList<Account>();
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
//	public Account getAccount(){
//		return account;
//	}
//
//	public void setAccount(Account acct){//Account acct = new SavingAccount()
//		account = acct;
//	}

    public void addAccount(Account acct){
        accounts.add(acct);
    }

    public int getNumOfAccounts(){
        return accounts.size();
    }

    public Account getAccount(int index){
        return accounts.get(index);
    }
    public Iterator<Account> getAccounts(){
        return accounts.iterator();
    }
}

