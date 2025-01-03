/**
 * The Director class encapsulates the construction process of Car objects
 * using the Builder design pattern. This class provides predefined
 * configurations for constructing different types of cars, such as luxury
 * and standard cars, by utilizing a Car.Builder instance.
 */
public class Director {

  /**
   * Configures a Car.Builder instance to construct a standard car with predefined attributes.
   * The standard car includes the default color, engine type, and absence of a sunroof.
   *
   * @param builder The Car.Builder instance used to configure and create the Car object.
   */
  public void constructStandardCar(Car.Builder builder) {
    builder.setColor("White")
        .setEngine("Standard")
        .setSunroof(false);
  }

  /**
   * Configures a Car.Builder instance to construct a luxury car with predefined attributes.
   * The luxury car is customized with specific configurations, such as color, engine type, and the addition of a sunroof.
   *
   * @param builder The Car.Builder instance used to configure and create the Car object.
   */
  public void constructLuxuryCar(Car.Builder builder) {
    builder.setColor("Black")
        .setEngine("V8 Turbo")
        .setSunroof(true);
  }
}
