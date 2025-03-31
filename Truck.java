// Harold Kemta

public class Truck extends Vehicle {
    // Instance variables
    private double loadCapacity;
    private double towingCapacity;

    // Default constructor
    public Truck() {
        super(); // Call Vehicle's default constructor
        this.loadCapacity = 1.0;
        this.towingCapacity = 1.0;
    }

    // Parameterized constructor
    public Truck(String manufacturerName, int numberOfCylinders, String ownerName, 
                 double loadCapacity, double towingCapacity) {
        super(manufacturerName, numberOfCylinders, ownerName); // Call Vehicle's constructor
        this.loadCapacity = (loadCapacity >= 0) ? loadCapacity : 1.0;
        this.towingCapacity = (towingCapacity >= 0) ? towingCapacity : 1.0;
    }

    // Accessors
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    // Mutators with validation
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = (loadCapacity >= 0) ? loadCapacity : 1.0;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = (towingCapacity >= 0) ? towingCapacity : 1.0;
    }

    // Equals method
    public boolean equals(Truck other) {
        return super.equals(other) &&
               this.loadCapacity == other.loadCapacity &&
               this.towingCapacity == other.towingCapacity;
    }

    // toString method
    public String toString() {
        return super.toString() +
               "Towing Capacity: " + towingCapacity + "\n" +
               "Load Capacity: " + loadCapacity + "\n";
    }
}
