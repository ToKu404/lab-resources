public class Employee {
    private String name;
    private String id;
    private String position;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String id, String position, int age, double salary) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayData() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Position: " + position);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
    }

    public void increaseSalary(double amount) {
        this.salary += amount;
        System.out.println("Salary increased by " + amount + " for employee " + name);
    }
}
