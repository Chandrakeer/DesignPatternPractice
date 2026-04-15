package AbstractFactoryPattern.Problem;

public class RazorpayGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " through Razorpay");
    }
}
