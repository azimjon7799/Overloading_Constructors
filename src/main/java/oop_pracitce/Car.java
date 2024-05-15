package oop_pracitce;

public class Car {
    // Private fields for encapsulation
    private String color;
    private String model;
    private double price;
    private boolean isAutomatic;

    // Constructor to initialize the Car object
    public Car(String color, String model, double price, boolean isAutomatic) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.isAutomatic = isAutomatic;
    }

    // Public getter and setter methods for each field

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    // Method to provide information about the car
    public String getCarInfo() {
        String transmission = isAutomatic ? "Automatic" : "Manual";
        return "Car Model: " + model + "\n" +
                "Color: " + color + "\n" +
                "Price: $" + price + "\n" +
                "Transmission: " + transmission;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Red", "Toyota Camry", 30000, true);

        // Getting information about the car
        System.out.println(myCar.getCarInfo());

        // Modifying the car's attributes
        myCar.setColor("Blue");
        myCar.setPrice(28000);

        // Getting updated information about the car
        System.out.println("\nUpdated Car Information:");
        System.out.println(myCar.getCarInfo());
    }
}

