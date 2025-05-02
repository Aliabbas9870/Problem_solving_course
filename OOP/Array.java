import java.util.Scanner;

class Array {

    public static void main(String[] args) {

        // /// insert every point value in arrays

        // int n, m, p;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter totla size of arrays");
        // n = sc.nextInt();
        // int arr[] = new int[n];
        // int arr1[] = new int[n + 1];
        // System.out.println("enter index");
        // p = sc.nextInt();

        // System.out.println("Please enter a value for array");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("enter value");
        // m = sc.nextInt();
        // for (int i = 0; i < n + 1; i++) {
        //     if (i < p) {
        //         arr1[i] = arr[i];
        //     } else if (i == p) {
        //         arr1[i] = m;
        //     } else {
        //         arr1[i] = arr[n - 1];
        //     }
        // }
        // System.out.println("Arrays which you inserted arrays. before");
        // for (int i = 0; i < n; i++) {
        //     System.out.print("[ " + arr[i] + " ]");
        // }

        // System.out.println("Arrays which you inserted arrays.");
        // for (int i = 0; i < n + 1; i++) {
        //     System.out.print("[ " + arr1[i] + " ]");
        // }



        // delete in  array value
        int n, m, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter totla size of arrays");
        n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n - 1];
        System.out.println("enter index");
        p = sc.nextInt();

        System.out.println("Please enter a value for array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("enter value");
        // m = sc.nextInt();
        for (int i = 0; i <arr.length; i++) {
            if (i < p) {
                arr1[i] = arr[i];
            } else if (i == p) {
                continue;
            } else {
                arr1[i-1] = arr[i];
            }
        }
        System.out.println("Arrays which you delete arrays. before");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ " + arr[i] + " ]");
        }

        System.out.println("Arrays which you delete valu arrays.");
        for (int i = 0; i < n-1; i++) {
            System.out.print("[ " + arr1[i] + " ]");
        }


    }
}