public class Main {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();

    System.out.println(singleton.getValue());

    singleton.setValue(10);

    Singleton singleton2 = Singleton.getInstance();

    System.out.println(singleton2.getValue());
  }
}
