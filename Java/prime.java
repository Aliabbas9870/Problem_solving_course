
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        System.out.println("welcome");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");

        int n = sc.nextInt();
        boolean isP = isPrime(n);
        if (isP) {
            System.out.println("Your num is prime: " + n);
        } else {
            System.out.println("Not Prime");
        }

    }

    public static boolean isPrime(int n) {
        int i = 2;
        while (i < n) {
            if (n % i == 0) {

                return false;
            }
            i++;

        }
        return true;
    }
}
