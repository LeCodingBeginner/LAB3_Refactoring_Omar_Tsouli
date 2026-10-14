package Problem3.PreRefactoring;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] argv){
        Account acc = new Account(500.0);
        FixedTermAccount fixedAcc = new FixedTermAccount(1000.0);

        List<Account> accountList = new ArrayList<>();
        accountList.add(acc);
        accountList.add(fixedAcc);

        // Bank.chargeMonthlyFee(accountList);




    }
}
