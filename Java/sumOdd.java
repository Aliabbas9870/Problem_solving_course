
import java.util.Scanner;

public class sumOdd {

    public static void main(String[] args) {
        System.out.println("Calculate odd sum");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int res = oddSum(num);
        System.out.println("result : " + num + " odd sum still " + res);

    }

    public static int oddSum(int n) {
        int i = 1;
        int re = 0;
        while (n >= i) {
            re = i + re;
            i += 2;
        }
        return re;

    }
}
