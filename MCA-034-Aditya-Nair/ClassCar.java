import java.util.Objects;

public class ClassCar {
    private String modelName;
    private String color;
    private double price;

    // Constructor to set initial values
    public ClassCar(String modelName, String color, double price) {
        this.modelName = modelName;
        this.color = color;
        this.price = price;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Model: " + modelName + ", Color: " + color + ", Price: $" + price;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ClassCar car = (ClassCar) obj;
        return Double.compare(car.price, price) == 0;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    public static void main(String[] args) {
        // Create two Car objects with the same price
        ClassCar car1 = new ClassCar("Toyota", "Red", 25000.0);
        ClassCar car2 = new ClassCar("Honda", "Blue", 20000.0);
    
    

        // Check if the two cars are equal
        if (car1.equals(car2)) {
            System.out.println("Both cars have the same price.");
        } else {
            System.out.println("Cars have different prices.");
        }
    }
}