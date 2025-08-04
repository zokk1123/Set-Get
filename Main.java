public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setPrice(-10);  // Output: "Price cannot be negative!"
        myBook.setPrice(19.99);
        System.out.println("Price: $" + myBook.getPrice()); // Output: 19.99
    }
}
