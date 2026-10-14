package Problem3.PreRefactoring;
import java.util.List;

public class Bank {
    public static void chargeMonthlyFee(List<Account> accounts){
        for (Account a : accounts) a.withdraw(10);
    }
}
