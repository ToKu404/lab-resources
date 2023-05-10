public class Book {
    private String title;
    private String author;
    private String type;
    private int yearPublished;
    private double price;

    public Book() {
    }

    public Book(String title, String author, String publisher, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.type = publisher;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Type: " + type);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: " + price);
    }

    public void discountPrice(double discountPercentage) {
        double discountAmount = price * discountPercentage / 100;
        price -= discountAmount;
        System.out.println("Discounted price is: " + price);
    }

    // getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String publisher) {
        this.type = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
