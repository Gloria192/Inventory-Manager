//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Gloria", 90, 53427.938);
        System.out.println("Total Value: " + item1.getValue());
        item1.displayItem();
        item1.addStock(10);
        item1.removeStock(40);
    }
}