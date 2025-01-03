public class Main {

  public static void main(String[] args) {
      Enemy goblinPrototype = new Enemy("Goblin", 100, 15, 5);

      // Clone the prototype to create new objects
      Enemy goblin1 = goblinPrototype.clone();
      Enemy goblin2 = goblinPrototype.clone();

      // Modify cloned instances
      goblin1.setHealth(120);           // Increase health for a stronger goblin
      goblin1.setDamage(20);            // Increase damage for the same goblin

      goblin2.setType("Goblin Scout");  // Change type to a scout
      goblin2.setSpeed(10);             // Make it faster

      System.out.println(goblin1); // Output: Enemy{type='Goblin', health=120, damage=20, speed=5}
      System.out.println(goblin2); // Output: Enemy{type='Goblin Scout', health=100, damage=15, speed=10}
    }
}
