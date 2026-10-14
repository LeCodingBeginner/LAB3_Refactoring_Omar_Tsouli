package Problem1.PostRefactoring;
import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String[] argv){
        InvoiceLine line1 = new InvoiceLine("laptop",9000.0);
        InvoiceLine line2 = new InvoiceLine("Mouse",150.0);
        InvoiceLine line3 = new InvoiceLine("USB cable",50.0);

        List<InvoiceLine> iL = new ArrayList<>();
        iL.add(line1);
        iL.add(line2);
        iL.add(line3);

        InvoiceData d = new InvoiceData("Younes",iL);
        InvoicePrinter iP = new InvoicePrinter();
        System.out.print(iP.print(d));
    }
}
