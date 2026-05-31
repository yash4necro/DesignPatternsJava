package StrategyPattern.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    public void processPayment(double total) {
        System.out.println("Connecting to Stripe API...");
        System.out.println("Charging $" + total + " to Credit Card.");
    }
}