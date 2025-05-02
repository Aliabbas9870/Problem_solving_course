
import java.util.Scanner;

public class twoArray {

    public static void main(String[] args) {
        System.out.println("Welcome to 2D arrays");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[][] array = new int[size][size];

        // Input elements in the array using while loops
        int i = 0;
        while (i < size) {
            int j = 0;
            while (j < size) {
                System.out.print("Enter the element at position [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        System.out.println("All elements:");
        i = 0;  // Reset i to 0 for printing
        while (i < size) {
            int j = 0;
            while (j < size) {
                System.out.print(array[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
}
