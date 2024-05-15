package oop_pracitce;

public class Point {
    // Private fields for encapsulation
    private double x;
    private double y;
    private double z;

    // Constructor to initialize the Point object
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Public getter methods for each field
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // Method to provide information about the point
    public String getPointInfo() {
        return "Point coordinates: (" + x + ", " + y + ", " + z + ")";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a Point object
        Point point = new Point(1.0, 2.5, 3.0);

        // Getting information about the point
        System.out.println(point.getPointInfo());

        // Accessing individual coordinates
        System.out.println("X coordinate: " + point.getX());
        System.out.println("Y coordinate: " + point.getY());
        System.out.println("Z coordinate: " + point.getZ());
    }
}

