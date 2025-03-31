public class Car extends Vehicle {
    // Instance variables
    private double gasMileage;
    private int numberOfPassengers;

    // Default constructor
    public Car() {
        super(); // Call Vehicle's default constructor
        this.gasMileage = 1.0;
        this.numberOfPassengers = 1;
    }

    // Parameterized constructor
    public Car(String manufacturerName, int numberOfCylinders, String ownerName, 
               double gasMileage, int numberOfPassengers) {
        super(manufacturerName, numberOfCylinders, ownerName); // Call Vehicle's constructor
        this.gasMileage = (gasMileage >= 0) ? gasMileage : 1.0;
        this.numberOfPassengers = (numberOfPassengers >= 0) ? numberOfPassengers : 1;
    }

    // Accessors
    public double getGasMileage() {
        return gasMileage;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    // Mutators with validation
    public void setGasMileage(double gasMileage) {
        this.gasMileage = (gasMileage >= 0) ? gasMileage : 1.0;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = (numberOfPassengers >= 0) ? numberOfPassengers : 1;
    }

    // Equals method
    public boolean equals(Car other) {
        return super.equals(other) &&
               this.gasMileage == other.gasMileage &&
               this.numberOfPassengers == other.numberOfPassengers;
    }

    // toString method
    public String toString() {
        return super.toString() +
               "Gas Mileage: " + gasMileage + "\n" +
               "Number of Passengers: " + numberOfPassengers + "\n";
    }
}
