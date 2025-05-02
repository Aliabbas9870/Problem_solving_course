
import java.util.Scanner;

public class arrCheckIncDec {

    public static void main(String[] args) {
        System.out.println("Welcome Check the arrays in increasing or descending order");
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        System.out.println(st);
        // int[] arr = arrEnter.arrayUti();
        // boolean inc = INC(arr);
        // boolean dec = DEC(arr);
        // if (inc || dec) {
        //     System.out.print("Arrays are sorted");
        // } else {
        //     System.out.print("Arrays are not shorted");
        // }
    }

    public static boolean INC(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]) {

                return false;

            }
            i++;
        }
        return true;
    }

    public static boolean DEC(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] > arr[i - 1]) {
                return false;

            }
            i++;
        }
        return true;
    }
}
