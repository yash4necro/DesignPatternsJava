package StrategyPattern.InventoryService;

public class InventoryServiceViaSQL implements InventoryService {
    public void updateInventory(String itemName, int quantity) {
        System.out.println("Connecting to SQL Database...");
        System.out.println("EXECUTE: UPDATE inventory SET stock = stock - " + quantity + " WHERE item_name = '" + itemName + "'");
    }
}
