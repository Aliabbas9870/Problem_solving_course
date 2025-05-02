
import java.util.Scanner;

public class febSeries {

    public static void main(String[] args) {
        System.out.print(" Welcome to feb series");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        feb(num);
        System.out.println();
    }

    public static void feb(int n) {

        if (n < 0) {
            return;
        }
        System.out.print("0 ");

        if (n == 0) {
            return;
        }
        System.out.print("1");

        int first = 0, sec = 1;
        while (first + sec <= n) {
            int third = first + sec;
            System.out.print(" " + third);
            first = sec;
            sec = third;
        }

    }
}
