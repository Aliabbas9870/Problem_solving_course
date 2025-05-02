
import java.util.Scanner;

class Pattren {

    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        Pat1(num);
        System.out.println();
        Pat(num);
        Pat3(num);
    }

    public static void Pat(int n) {
        /*
         * *
         * * *
         * * * *
         */
        int row = 0;

        while (n > row) {
            int col = 0;
            while (col < row) {
                System.out.print(" *");
                col++;

            }
            System.out.println();
            row++;

        }

    }

    public static void Pat1(int n) {
//****** */
//****
//*** 
//* 
        int row = n;

        while (row > 0) {
            int i = 0;
            while (i < row) {

                System.out.print("* ");
                i++;

            }
            System.out.println();
            row--;

        }

    }

    public static void Pat3(int n) {
        int row = n;
        while (row > 0) {
            int i = 0;
            while (i <= (n + row)) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row--;
        }

    }
}
