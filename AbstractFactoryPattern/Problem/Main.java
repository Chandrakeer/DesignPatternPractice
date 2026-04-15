package AbstractFactoryPattern.Problem;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService("Razorpay");
        checkoutService.checkout(100.0);
    }
}
