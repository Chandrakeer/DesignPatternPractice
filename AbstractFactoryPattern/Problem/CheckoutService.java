package AbstractFactoryPattern.Problem;

public class CheckoutService {
    
    private String gatewayType;

    public CheckoutService(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    public void checkout(double amount) {
        PaymentGateway paymentGateway;

        if (gatewayType.equals("Razorpay")) {
            paymentGateway = new RazorpayGateway();
        } else if (gatewayType.equals("PayU")) {
            paymentGateway = new PayUGateway();
        } else {
            throw new IllegalArgumentException("Unsupported payment gateway: " + gatewayType);
        }
        // Process payment using selected gateway
        paymentGateway.processPayment(amount);

        // Always uses GSTInvoice, even though more types may exist later
        Invoice invoice = new GSTInvoice();
        invoice.generateInvoice();
    }
}
