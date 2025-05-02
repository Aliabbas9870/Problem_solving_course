
import java.util.Scanner;

public class arrayOccur {

    public static void main(String[] args) {
        System.out.println("Welcome to check occurenece");
        int[] arr = arrEnter.arrayUti();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num u check: ");
        int n = sc.nextInt();
        int f = Check(arr, n);

        System.out.println("This number ocure " + f + " times");

    }

    public static int Check(int[] ar, int n) {
        int count = 0, i = 0;

        while (i < ar.length) {
            if (n == ar[i]) {
                count++;

            }
            i++;
        }
        return count;
    }
}
