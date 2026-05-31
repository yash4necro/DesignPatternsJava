package StrategyPattern.DiscountStrategy;

public class VipUserDiscountStrategy implements DiscountStrategy {
    public double getDiscount(double total) {
        System.out.println("VIP Discount applied.");
        return total * 0.80;
    }
}

