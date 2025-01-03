/**
 * An enumeration representing different types of pizzas.
 *
 * This enum is used to specify the kind of pizza desired when ordering
 * through a factory or any pizza-processing system. Each constant corresponds
 * to a specific pizza variety implemented as a separate class.
 *
 * Constants:
 * - MARGHERITA: Represents a margherita pizza.
 * - PEPPERONI: Represents a pepperoni pizza.
 * - VEGGIE: Represents a vegetarian pizza.
 *
 * It serves as a parameter to the factory method, allowing clients to request
 * and differentiate between pizza types without coupling to specific implementations.
 */
public enum PizzaType {
  MARGHERITA,
  PEPPERONI,
  VEGGIE
}

