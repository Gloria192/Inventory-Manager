public class Item {
    public String name;
    public int quantity;
    public double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
        }
        System.out.println("Total Value we added in the stock: " + quantity);
    }

    public void removeStock(int amount) {
        if (amount > 0) {
            quantity -= amount;
        }
        System.out.println("Total Value remain the stock: " + quantity);
    }

    public double getValue() {
        return quantity * price;
    }

    public void displayItem() {
        System.out.println("Item Name: " + name + ", Quantity: " + quantity + ", Price: " + price);
    }
}