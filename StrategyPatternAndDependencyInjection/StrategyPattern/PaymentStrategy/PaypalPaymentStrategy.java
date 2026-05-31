package StrategyPattern.PaymentStrategy;

public class PaypalPaymentStrategy implements PaymentStrategy {
    public void processPayment(double total) {
        System.out.println("Redirecting to PayPal API...");
        System.out.println("Charging $" + total + " to PayPal account.");
    }
}