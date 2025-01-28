package singlylinkedlist.inventorymanagementsystem;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        inventory.addAtEnd("Laptop", 101, 10, 800.0);
        inventory.addAtBeginning("Mouse", 102, 50, 20.0);
        inventory.addAtPosition("Keyboard", 103, 30, 50.0, 2);

        inventory.displayItems();
        inventory.searchItem(102);
        inventory.updateQuantity(102, 60);
        inventory.removeByItemId(103);

        inventory.displayItems();
        inventory.calculateTotalValue();

        inventory.sortByName();
        System.out.println("After Sorting by Name:");
        inventory.displayItems();

        inventory.sortByPrice();
        System.out.println("After Sorting by Price:");
        inventory.displayItems();
    }
}
