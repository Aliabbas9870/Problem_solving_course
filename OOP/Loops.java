import java.util.Scanner;

class Loops {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[n];
        System.out.println("Enter num");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        int i = 0;
        System.out.println("========Show===");
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }

        System.out.println("============do while ===================");
        
       
        // i = 0;

        do {
            System.out.println(arr[i]);
            i++;
        } while (i < arr.length);
    }
}
