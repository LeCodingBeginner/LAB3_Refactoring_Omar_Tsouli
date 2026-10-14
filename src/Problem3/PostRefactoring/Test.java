package Problem3.PostRefactoring;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] argv){
        CurrentAccount currAcc = new CurrentAccount(500.0);
        FixedTermAccount fixedAcc = new FixedTermAccount(1000.0);

        List<WithdrawableAccount> l = new ArrayList<>();

        l.add(currAcc);

        Bank.chargeMonthlyFee(l);

        System.out.println("Current account balance: " + l.get(0).getBalance());
        System.out.println("Fixed-term account balance: " + fixedAcc.getBalance());

    }

}
