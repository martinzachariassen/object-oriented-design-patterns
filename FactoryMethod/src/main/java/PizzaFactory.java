/**
 * An abstract factory class for creating different types of pizzas.
 *
 * This class provides a blueprint for implementing the Factory Method design pattern.
 * Subclasses are responsible for providing concrete implementations of the
 * {@code createPizza} method to instantiate specific types of pizzas.
 *
 * The {@code PizzaFactory} class also defines a common workflow for ordering a pizza
 * through the {@code orderPizza} method, which handles the preparation, baking,
 * and boxing of the pizza after it is created.
 *
 * Responsibilities:
 * - Defines a factory method {@code createPizza}, which must be implemented by subclasses
 *   to specify how different types of pizzas are created.
 * - Provides a standardized process for handling the preparation, baking, and boxing
 *   of pizzas in the {@code orderPizza} method.
 *
 * This class promotes decoupling of pizza creation logic from the client code
 * by leveraging the Factory Method design pattern.
 */
abstract class PizzaFactory {

  abstract Pizza createPizza(PizzaType type);

  public void orderPizza(PizzaType type) {
    Pizza pizza = createPizza(type);  // Factory method
    pizza.prepare();
    pizza.bake();
    pizza.box();
  }
}
