/**
 * A concrete implementation of the PizzaFactory. This factory is responsible for
 * creating different types of pizza objects based on the specified PizzaType.
 *
 * The SimplePizzaFactory overrides the abstract createPizza method
 * and provides the logic to instantiate the appropriate pizza subclass
 * based on the type provided.
 *
 * This class acts as the "Concrete Creator" in the Factory Method design pattern.
 * It encapsulates the creation logic and abstracts away the details of pizza subclass instantiation.
 */
public class SimplePizzaFactory extends PizzaFactory {

  @Override
  Pizza createPizza(PizzaType type) {
    return switch (type) {
      case MARGHERITA -> new Margherita();
      case PEPPERONI -> new Pepperoni();
      case VEGGIE -> new VeggiePizza();
    };
  }
}
