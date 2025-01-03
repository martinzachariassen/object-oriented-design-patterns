/**
 * Represents a general blueprint for creating different types of pizzas.
 *
 * This interface defines the common methods that all concrete pizza types must implement,
 * ensuring a consistent behavior for preparation, baking, and boxing of pizzas.
 *
 * Responsibilities:
 * - The {@code prepare} method is intended to handle the preparation logic specific to a pizza type.
 * - The {@code bake} method is used to define the baking process for the pizza.
 * - The {@code box} method outlines how the pizza should be packed or boxed.
 *
 * Any class implementing this interface should provide concrete implementations
 * for these methods to meet the expected lifecycle of a pizza.
 */
interface Pizza {
  void prepare();
  void bake();
  void box();
}
