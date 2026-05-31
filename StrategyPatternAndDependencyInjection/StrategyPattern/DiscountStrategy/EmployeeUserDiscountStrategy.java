package StrategyPattern.DiscountStrategy;

public class EmployeeUserDiscountStrategy implements DiscountStrategy {
    public double getDiscount(double total) {
        System.out.println("Employee Discount applied.");
        return total * 0.50;
    }
}
