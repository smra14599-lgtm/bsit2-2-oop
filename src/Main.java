import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("2102", "Ernesto Razo", 328);
        Book book2 = new Book("2101", "Ernesto", 281);
        Book book3 = new Book("Networking", "Brian", 180);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}
