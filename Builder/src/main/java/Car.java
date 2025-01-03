/**
 * Represents a Car with required and optional attributes.
 * This class uses the Builder design pattern to simplify the creation of Car objects,
 * allowing mandatory attributes to be set along with optional configurations.
 */
public class Car {
  // Required attributes
  private final String brand;
  private final String model;

  // Optional attributes
  private final String color;
  private final String engine;
  private final boolean sunroof;

  // Private constructor to enforce object creation through Builder
  private Car(Builder builder) {
    this.brand = builder.brand;
    this.model = builder.model;
    this.color = builder.color;
    this.engine = builder.engine;
    this.sunroof = builder.sunroof;
  }

  @Override
  public String toString() {
    return "Car{" +
        "brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", engine='" + engine + '\'' +
        ", sunroof=" + sunroof +
        '}';
  }

  /**
   * Builder class for constructing instances of the Car class.
   * This class allows setting required attributes for the Car object
   * and optionally configuring additional attributes before creating the object.
   */
  public static class Builder {
    // Required attributes
    private final String brand;
    private final String model;

    // Optional attributes with default values
    private String color = "White";
    private String engine = "Standard";
    private boolean sunroof = false;

    // Builder constructor with required parameters
    public Builder(String brand, String model) {
      this.brand = brand;
      this.model = model;
    }

    // Setter for optional color
    public Builder setColor(String color) {
      this.color = color;
      return this;
    }

    // Setter for optional engine
    public Builder setEngine(String engine) {
      this.engine = engine;
      return this;
    }

    // Setter for optional sunroof
    public Builder setSunroof(boolean sunroof) {
      this.sunroof = sunroof;
      return this;
    }

    // Build method to create a Car object
    public Car build() {
      return new Car(this);
    }
  }
}
