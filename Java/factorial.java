
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        System.out.println("Welcone factorial calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numnber: ");
        int num = sc.nextInt();
        long re = fact(num);
        System.out.println("Fact is: " + re);

    }

    public static int fact(int n) {

        int i = 2;
        if (n < 2) {
            return 1;

        }
        int fact = 1;
        while (n >= i) {
            fact *= i;
            i++;

        }
        return fact;

    }
}
