package StrategyPattern.DiscountStrategy;

public class RegularUserDiscountStrategy implements DiscountStrategy {
    public double getDiscount(double total) {
        System.out.println("No discount applied.");
        return total;
    }
}
