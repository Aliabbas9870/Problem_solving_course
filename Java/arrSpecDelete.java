
import java.util.Scanner;

public class arrSpecDelete {

    public static void main(String[] args) {
        System.out.println("Welcome delete specific element in arrays");
        int[] arr = arrEnter.arrayUti();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element which u want to delete");
        int num = sc.nextInt();
        int[] Narr = ArrD(arr, num);
        System.out.print("New Array");
        arrEnter.DisplayArr(Narr);
    }

    public static int[] ArrD(int[] arr, int n) {
        int occ = arrayOccur.Check(arr, n);
        int i = 0, j = 0;
        if (occ == 0) {
            return arr;
        }
        int size = arr.length - occ;
        int[] Narray = new int[size];
        while (i < arr.length) {
            if (arr[i] != n) {
                Narray[j] = arr[i];
                j++;
            }
            i++;

        }

        return Narray;
    }
}
