package oop_pracitce;

public class RightAngledTriangle {
    // Private fields for encapsulation
    private double base;
    private double height;

    // Constructor to initialize the RightAngledTriangle object
    public RightAngledTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Getter and Setter methods for base
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setBase(int base) {
        this.base = (double) base;
    }

    public void setBase(float base) {
        this.base = (double) base;
    }

    public void setBase(long base) {
        this.base = (double) base;
    }

    // Getter and Setter methods for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = (double) height;
    }

    public void setHeight(float height) {
        this.height = (double) height;
    }

    public void setHeight(long height) {
        this.height = (double) height;
    }

    // Method to calculate the area of the right-angled triangle
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Method to calculate the perimeter of the right-angled triangle
    public double calculatePerimeter() {
        double hypotenuse = Math.sqrt((base * base) + (height * height));
        return base + height + hypotenuse;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a RightAngledTriangle object
        RightAngledTriangle triangle = new RightAngledTriangle(3, 4);

        // Printing the area and perimeter
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

        // Modifying the base and height using different data types
        triangle.setBase(5);
        triangle.setHeight(12.5f);

        // Printing the updated area and perimeter
        System.out.println("\nUpdated Area: " + triangle.calculateArea());
        System.out.println("Updated Perimeter: " + triangle.calculatePerimeter());
    }
}
