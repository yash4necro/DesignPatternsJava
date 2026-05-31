import StrategyPattern.InventoryService.InventoryService;
import StrategyPattern.Notifications.Notifications;
import StrategyPattern.PaymentStrategy.PaymentStrategy;
import StrategyPattern.DiscountStrategy.DiscountStrategy;

public class CheckoutProcessor {

    private DiscountStrategy discountStrategy;
    private PaymentStrategy paymentStrategy;
    private InventoryService inventoryService;
    private Notifications notifications;

    public CheckoutProcessor(DiscountStrategy discountStrategy,
        PaymentStrategy paymentStrategy,
        InventoryService inventoryService,
        Notifications notifications) {
            this.discountStrategy = discountStrategy;
            this.paymentStrategy = paymentStrategy;
            this.inventoryService = inventoryService;
            this.notifications = notifications;
    }

    public void processOrder (Order order) {
        // 1. Calculate Total Math
        double total = order.getTotal();

        // 2. Discount Logic
        total = discountStrategy.getDiscount(total);

        // 3. Payment Processing
        paymentStrategy.processPayment(total);

        // 4. Inventory Management
        inventoryService.updateInventory(order.getItemName(), order.getQuantity());

        // 5. Notifications
        notifications.sendNotification();
    }
}