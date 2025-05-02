public class swap {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    // int c = a;
    // a = b;
    // b = c;
    System.out.println("a " + a + " " + "  b " + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a " + a + " " + "  b " + b);

  }
}