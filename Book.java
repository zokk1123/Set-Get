class Book {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        if (newPrice >= 0) {
            price = newPrice;
        } else {
            System.out.println("Price cannot be negative!");
        }
    }
}
