package AbstractFactoryPattern.Problem;

public class PayUGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " through PayU");
    }
}
