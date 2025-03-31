public class Vehicle {
    // Instance variables
    private String manufacturerName;
    private int numberOfCylinders;
    private String ownerName;

    // Default constructor
    public Vehicle() {
        this.manufacturerName = "none";
        this.numberOfCylinders = 6;
        this.ownerName = "none";
    }

    // Parameterized constructor
    public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName) {
        this.manufacturerName = (manufacturerName != null) ? manufacturerName : "none";
        this.numberOfCylinders = (numberOfCylinders > 0) ? numberOfCylinders : 6;
        this.ownerName = (ownerName != null) ? ownerName : "none";
    }

    // Accessor methods
    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public String getOwnerName() {
        return ownerName;
    }

    // Mutator methods with validation
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = (manufacturerName != null) ? manufacturerName : "none";
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = (numberOfCylinders > 0) ? numberOfCylinders : 6;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = (ownerName != null) ? ownerName : "none";
    }

    // Equals method to compare two Vehicle objects
    public boolean equals(Vehicle other) {
        return this.manufacturerName.equals(other.manufacturerName) &&
               this.numberOfCylinders == other.numberOfCylinders &&
               this.ownerName.equals(other.ownerName);
    }

    // toString method
    public String toString() {
        return "Manufacturer's Name: " + manufacturerName + "\n" +
               "Number of Cylinders: " + numberOfCylinders + "\n" +
               "Owner's Name: " + ownerName + "\n";
    }
}
