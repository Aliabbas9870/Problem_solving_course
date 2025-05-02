import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        System.out.println("Hello ttest");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arrays");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter a arrays");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("arrays are printed in assending order");
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

            System.out.print(" " + arr[i] + " ");
        }

        System.out.println("\n arrays are printed unorder list desecnding list ");
        temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }

            System.out.print(" " + arr[i] + " ");
        }

    }
}