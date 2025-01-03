public class Margherita implements Pizza {

  @Override
  public void prepare() {
    System.out.println("Preparing margherita pizza");
  }

  @Override
  public void bake() {
    System.out.println("Baking margherita pizza");
  }

  @Override
  public void box() {
    System.out.println("Boxing margherita pizza");
  }
}
