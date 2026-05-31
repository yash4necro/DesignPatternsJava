import StrategyPattern.DiscountStrategy.EmployeeUserDiscountStrategy;
import StrategyPattern.DiscountStrategy.VipUserDiscountStrategy;
import StrategyPattern.InventoryService.InventoryServiceViaSQL;
import StrategyPattern.Notifications.EmailNotifications;
import StrategyPattern.PaymentStrategy.CreditCardPaymentStrategy;
import StrategyPattern.PaymentStrategy.PaypalPaymentStrategy;

public class Main {
    public static void main(String[] args) {
        
        // ==========================================
        // SCENARIO 1: VIP User using Credit Card
        // ==========================================
        System.out.println("--- Scenario 1: VIP & Credit Card ---");
        
        Order laptopOrder = new Order("MacBook Pro", 1, 2500.00);
        
        // Assemble the specific tools for this scenario
        CheckoutProcessor vipProcessor = new CheckoutProcessor(
            new VipUserDiscountStrategy(),
            new CreditCardPaymentStrategy(),
            new InventoryServiceViaSQL(),
            new EmailNotifications()
        );
        
        vipProcessor.processOrder(laptopOrder);


        System.out.println("\n--- Scenario 2: Employee using PayPal ---");
        // ==========================================
        // SCENARIO 2: Employee User using PayPal
        // ==========================================
        
        Order coffeeOrder = new Order("Coffee Beans", 3, 20.00);
        
        // Re-assemble the processor with different tools!
        CheckoutProcessor employeeProcessor = new CheckoutProcessor(
            new EmployeeUserDiscountStrategy(),
            new PaypalPaymentStrategy(),
            new InventoryServiceViaSQL(),
            new EmailNotifications() // Reusing the same notification type
        );
        
        employeeProcessor.processOrder(coffeeOrder);
    }
}