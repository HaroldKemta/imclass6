public class Main {
    public static void main(String[] args) {
        // Creating and displaying a Vehicle
        Vehicle v1 = new Vehicle("Toyota", 4, "Alice");
        System.out.println("Vehicle 1:\n" + v1);

        // Creating and displaying a Truck
        Truck t1 = new Truck("Ford", 6, "Bob", 2.5, 5.0);
        System.out.println("Truck 1:\n" + t1);

        // Creating and displaying a Car
        Car c1 = new Car("Honda", 4, "Charlie", 30.5, 5);
        System.out.println("Car 1:\n" + c1);

        // Testing equals method
        Truck t2 = new Truck("Ford", 6, "Bob", 2.5, 5.0);
        System.out.println("Truck 1 equals Truck 2: " + t1.equals(t2));

        Car c2 = new Car("Honda", 4, "Charlie", 30.5, 5);
        System.out.println("Car 1 equals Car 2: " + c1.equals(c2));

        Vehicle v2 = new Vehicle("Toyota", 4, "Alice");
        System.out.println("Vehicle 1 equals Vehicle 2: " + v1.equals(v2));
    }
}
