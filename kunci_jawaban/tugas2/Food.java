public class Food {
    private String name;
    private String type;
    private double price;

    public Food() {
    }

    public Food(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public void displayFoodInfo() {
        System.out.println("Food Name: " + name);
        System.out.println("Food Type: " + type);
        System.out.println("Price: " + price);
    }

    public void cook() {
        System.out.println("Cooking " + name + "...");
    }

    public void eat() {
        System.out.println("Eating " + name + "...");
    }

    // getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
