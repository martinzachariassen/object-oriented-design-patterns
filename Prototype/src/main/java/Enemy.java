public class Enemy implements Prototype {

  private String type;
  private int health;
  private int damage;
  private int speed;

  public Enemy(String type, int health, int damage, int speed) {
    this.type = type;
    this.health = health;
    this.damage = damage;
    this.speed = speed;
  }

  // Copy Constructor for cloning
  public Enemy(Enemy original) {
    this.type = original.type;
    this.health = original.health;
    this.damage = original.damage;
    this.speed = original.speed;
  }

  @Override
  public Enemy clone() {
    return new Enemy(this); // Use copy constructor
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  @Override
  public String toString() {
    return "Enemy{" +
        "type='" + type + '\'' +
        ", health=" + health +
        ", damage=" + damage +
        ", speed=" + speed +
        '}';
  }
}
