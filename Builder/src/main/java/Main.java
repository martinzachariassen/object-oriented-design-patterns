/**
 * The Main class demonstrates the usage of the Builder design pattern for creating Car objects
 * with different configurations. It utilizes the Director class to manage the construction
 * process for predefined types of cars such as standard and luxury cars.
 *
 * This class serves as the entry point of the application, where the main method initiates
 * the construction and displays the details of the created Car objects.
 */
public class Main {

  public static void main(String[] args) {
    Director director = new Director();

    // Build a Standard Car
    Car.Builder standardCarBuilder = new Car.Builder("Toyota", "Corolla");
    director.constructStandardCar(standardCarBuilder);
    Car standardCar = standardCarBuilder.build();
    System.out.println("Standard Car: " + standardCar);

    // Build a Luxury Car
    Car.Builder luxuryCarBuilder = new Car.Builder("BMW", "X5");
    director.constructLuxuryCar(luxuryCarBuilder);
    Car luxuryCar = luxuryCarBuilder.build();
    System.out.println("Luxury Car: " + luxuryCar);
  }
}
