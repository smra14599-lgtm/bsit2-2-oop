import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("═══ Food Ordering System ═══\n");
        System.out.println("Creating orders and adding items...");

        ArrayList<Order> records = new ArrayList<>();

        Order o1 = new Order("Alice Johnson");
        o1.insert("Pizza", 12.99);
        o1.insert("Burger", 8.75);
        o1.insert("Fries", 3.00);
        System.out.println("Items added: Burger, Fries");
        records.add(o1);

        Order o2 = new Order("Bob Smith");
        o2.insert("", 10.00);
        o2.insert("Salad", 0);
        o2.insert("Pasta", 10.25);
        o2.insert("Salad", 7.00);
        o2.insert("Soup", 7.25);
        System.out.println("Items added: Pasta, Salad, Soup");
        records.add(o2);

        Order o3 = new Order("Charlie Brown");
        o3.insert("Sandwich", 9.50);
        o3.insert("Hotdog", 6.00);
        o3.insert("Soda", 0);
        System.out.println("Items added: Hotdog, Soda");
        records.add(o3);

        System.out.println("\nOrder Results:");
        for (Order o : records) {
            System.out.println(o);
        }

        System.out.println("\nTotal orders created: " + records.size());

        Order big = records.get(0);
        for (Order o : records) {
            if (o.totalPrice() > big.totalPrice()) {
                big = o;
            }
        }
        System.out.println("Largest order: " + big.getCustomer() +
                " ($" + String.format("%.2f", big.totalPrice()) + ")");
    }
}
