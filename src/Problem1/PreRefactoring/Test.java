package Problem1.PreRefactoring;

public class Test {
    public static void main(String[] argv){
        // let's add the three lines:
        Invoice invoice = new Invoice("Younes");
        invoice.addLine("PC",1000.0);
        invoice.addLine("Fishing rod",120.0);
        invoice.addLine("Phone case",10.0);
        // now let's print the result:
        System.out.print(invoice.print());
    }
}
