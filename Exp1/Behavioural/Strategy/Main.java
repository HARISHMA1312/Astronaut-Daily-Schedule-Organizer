package Behavioural.Strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(250);

        // Pay using UPI
        cart.setPaymentStrategy(new UPIPayment());
        cart.checkout(100);
    }
}
