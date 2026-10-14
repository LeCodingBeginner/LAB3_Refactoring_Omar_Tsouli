package Problem3.PostRefactoring;

import java.util.List;

public interface Account{
    public void deposit(double amount);
    public double getBalance();
}

interface WithdrawableAccount extends Account{
    public void withdraw(double amount);
}

class CurrentAccount implements WithdrawableAccount{
    protected double balance;

    public CurrentAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public void withdraw(double amount){
        if (amount > this.balance) throw new IllegalArgumentException("Insufficient funds");
        this.balance -= amount;
    }

}

class FixedTermAccount implements Account{
    protected double balance;

    public FixedTermAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > this.balance) throw new IllegalArgumentException("Insufficient funds");
        this.balance += balance;
    }

    public double getBalance(){
        return this.balance;
    }

}

class Bank{
    public static void chargeMonthlyFee(List<WithdrawableAccount> accounts){
        for (WithdrawableAccount a: accounts){
            a.withdraw(10);
        }
    }
}

class StudentAccount extends CurrentAccount{
    protected double balance;

    public StudentAccount(double balance){
        super(balance);
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 200) throw new UnsupportedOperationException("Locked until maturity");
        super.withdraw(amount);
    }
}