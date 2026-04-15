package AbstractFactoryPattern.Problem;

public class GSTInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Generating GST invoice");
    }
}
