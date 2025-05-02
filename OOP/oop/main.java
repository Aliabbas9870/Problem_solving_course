
public class main {

  public static void main(String[] args) {

    car myC = new car();
    myC.driver();
    String var1 = "Heeelo";
    int var2 = 2883;
    int var3 = 23;
    System.out.printf("%-16s%-10d%d%n", var1, var2, var2);
    System.out.printf("%-16s%-10d%s%n", var1, var3, var1);
    System.out.printf("%-16s%-10d%d%n", var1, var2, var2);
    System.out.printf("%-16s%-10d%s%n", var1, var3, var1);

    // int smallNumber = 12;
    // int largeNumber = 12345;
    // String myString = "Hello";

    // // Using a fixed width for the integer to maintain consistent spacing
    // System.out.printf("%s%10d%n", myString, smallNumber); // 10 spaces for the
    // int
    // System.out.printf("%s%10d%n", myString, largeNumber); //
    // System.out.printf("%-10s%d%n", myString, smallNumber); // 10 spaces for the
    // String
    // System.out.printf("%-10s%d%n", myString, largeNumber); // Same
  }
}
