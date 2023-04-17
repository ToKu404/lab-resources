public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isSold;

    public Car() {
    }

    public Car(String brand, String model, int year, double price, boolean sold) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isSold = sold;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        this.isSold = sold;
    }

    public void sell() {
        this.isSold = true;
        System.out.println("Car " + brand + " " + model + " sold!");
    }

    public void displayData() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Price: " + price);
        System.out.println("Car Status: " + (isSold ? "Sold" : "Available"));
    }

}
