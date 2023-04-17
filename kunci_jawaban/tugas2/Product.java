public class Product {
    private String name;
    private String category;
    private double price;
    private int stock;
    private boolean isAvailable;

    public Product() {
    }

    public Product(String name, String category, double price, int stock, boolean isAvailable) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void displayData() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Category: " + category);
        System.out.println("Product Price: " + price);
        System.out.println("Product Stock: " + stock);
        System.out.println("Product Availability: " + isAvailable);
    }

    public void sellProduct(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " " + name + " sold!");
        } else {
            System.out.println("Not enough " + name + " in stock!");
        }
    }

    public void addStock(int quantity) {
        stock += quantity;
        System.out.println(quantity + " " + name + " added to stock.");
    }

    public double calculateTotalPrice(int quantity) {
        return price * quantity;
    }
}
