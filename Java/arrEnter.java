
import java.util.Scanner;

public class arrEnter {

    public static int[] arrayUti() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of ele: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter a element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        return arr;

    }

    public static void DisplayArr(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(" " + arr[i]);
            i++;
        }
        System.out.println();
    }
}
