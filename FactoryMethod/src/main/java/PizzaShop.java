/**
 * The PizzaShop class serves as the entry point for the pizza ordering application.
 *
 * This class demonstrates the use of the Factory Method design pattern by
 * instantiating a PizzaFactory (specifically a SimplePizzaFactory)
 * and calling its {@code orderPizza} method to create and process different types of pizzas.
 *
 * The program simulates the scenario where customers order different kinds of pizzas such as:
 * - Margherita
 * - Veggie
 * - Pepperoni
 *
 * The PizzaShop class interacts with the factory, which encapsulates the pizza creation
 * logic, and ensures pizzas are prepared, baked, and boxed without requiring
 * the PizzaShop class to know the specific details of pizza creation.
 */
public class PizzaShop {

  public static void main(String[] args) {
    PizzaFactory factory = new SimplePizzaFactory();

    System.out.println("Customer #1 orders a Margherita Pizza:");
    factory.orderPizza(PizzaType.MARGHERITA);

    System.out.println("\nCustomer #2 orders a Veggie Pizza:");
    factory.orderPizza(PizzaType.VEGGIE);

    System.out.println("\nCustomer #3 orders a Pepperoni Pizza:");
    factory.orderPizza(PizzaType.PEPPERONI);
  }
}
