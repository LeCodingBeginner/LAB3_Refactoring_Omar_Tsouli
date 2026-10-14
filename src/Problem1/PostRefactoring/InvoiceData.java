package Problem1.PostRefactoring;
import Problem1.PreRefactoring.Invoice;

import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class InvoiceData {
    private String customer;
    private List<InvoiceLine> lines = new ArrayList<>();

    public InvoiceData(String customer,List<InvoiceLine> lines){
        this.customer = customer;
        this.lines = lines;
    }

    // getters:
    public String getCustomer(){
        return this.customer;
    }

    public List<InvoiceLine> getLines(){
        return this.lines;
    }

}

class InvoiceLine{
    private String item;
    private double price;

    public InvoiceLine(String item, double price){
        this.item = item;
        this.price = price;
    }

    public String getItem(){
        return this.item;
    }

    public double getPrice() {
        return price;
    }

}

class InvoiceCalculator{
    // the total pre-tax:
    public double subtotal(InvoiceData d){
        double subtotal = 0;
        for (int i = 0 ; i<d.getLines().size(); i++){
            subtotal+= d.getLines().get(i).getPrice();
        }
        return subtotal;
    }

    // the total post-tax:
    public double total(InvoiceData d){
        if (subtotal(d) >= 1000){
            return subtotal(d) - subtotal(d)*0.05;
        }
        return subtotal(d) - subtotal(d)*0.2;
    }

}

class InvoicePrinter{
    InvoiceCalculator calculator = new InvoiceCalculator();
    public String print(InvoiceData d){
        StringBuilder s = new StringBuilder();
        s.append("Invoice for ").append(d.getCustomer()).append("\n");
        for (int i = 0 ; i<d.getLines().size(); i++){
            s.append(d.getLines().get(i).getItem()).append("    ").append(d.getLines().get(i).getPrice()).append("\n");
        }
        s.append("Subtotal    ").append(calculator.subtotal(d)).append("\n");
        s.append("TOTAL    ").append(calculator.total(d));

        return s.toString();
    }
}

class InvoiceRepository{
    InvoicePrinter printer = new InvoicePrinter();
    public void save(InvoiceData d) throws IOException {
        try (FileWriter fw = new FileWriter(d.getCustomer() + ".txt")) {
            fw.write(printer.print(d));
        }
    }
}
