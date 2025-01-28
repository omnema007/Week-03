package singlylinkedlist.inventorymanagementsystem;

class InventoryManagement {
    private Item head;

    //method to add item at the beginning
    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    //method to add item at the end
    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }

        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    //method to add item at specific position
    public void addAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if(position == 1) {
            newItem.next = head;
            head = newItem;
            return;
        }

        Item temp = head;
        for (int i = 1; i < position-1 && temp != null; i++) {
            temp = temp.next;
        }

        if(temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    //method to remove item by Item id
    public void removeByItemId(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        if(head.itemId == itemId) {
            head = head.next;
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item not found");
            return;
        }
        temp.next = temp.next.next;
    }

    //method to update quantity
    public void updateQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while(temp != null && temp.itemId != itemId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Item not found");
        } else {
            temp.quantity = newQuantity;
        }

        }

    public void searchItem(int itemId) {
        Item temp = head;
        while (temp != null && temp.itemId != itemId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item found: " + temp.itemName + ", Id " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);

        }
    }

    //method to calculate total value
    public void calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }

    // Sort inventory by Item Name (ascending order)
    public void sortByName() {
        if (head == null || head.next == null) return;
        head = mergeSort(head, "name");
    }

    // Sort inventory by Price (ascending order)
    public void sortByPrice() {
        if (head == null || head.next == null) return;
        head = mergeSort(head, "price");
    }

    // Merge Sort for sorting
    private Item mergeSort(Item head, String sortBy) {
        if (head == null || head.next == null) return head;

        Item mid = getMiddle(head);
        Item nextOfMid = mid.next;
        mid.next = null;

        Item left = mergeSort(head, sortBy);
        Item right = mergeSort(nextOfMid, sortBy);

        return merge(left, right, sortBy);
    }

    private Item merge(Item left, Item right, String sortBy) {
        if (left == null) return right;
        if (right == null) return left;

        Item result;
        if ((sortBy.equals("name") && left.itemName.compareToIgnoreCase(right.itemName) <= 0) ||
                (sortBy.equals("price") && left.price <= right.price)) {
            result = left;
            result.next = merge(left.next, right, sortBy);
        } else {
            result = right;
            result.next = merge(left, right.next, sortBy);
        }
        return result;
    }

    private Item getMiddle(Item head) {
        if (head == null) return null;

        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Display all items
    public void displayItems() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Item temp = head;
        System.out.println("Inventory:");
        while (temp != null) {
            System.out.println("Name: " + temp.itemName + ", ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}
