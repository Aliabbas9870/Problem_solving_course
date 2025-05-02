import java.util.Scanner;

public class Opp {
    public static void main(Strings[] args) {
        System.out.println("hello ali");
        Scanner sc = new Scanner(System.in);

        // int number1 = sc.nextInt();
        // int number2 = sc.nextInt();
        // System.out.println("sum is =" + (number1 + number2));

        /////////// solid rectangel 1////
        ///////////////////////////////
        // for (int i = 1; i < 10; i++) {

        // for (int j = 1; j < 20; j++) {
        // System.out.print("*");
        // }
        // // System.out.println("*");
        // System.out.println();

        // }

        /////////////
        /// hollow rectange ///
        int n = 5;
        int m = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // // (i == 1 || j == 1 || i == n || j == m||j==3)
        // if (i != j) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        //////////// triangle
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }

        // rvert triangle pattern
        // int n=5;
        for (int i = 1; i <= n; i++) {
            // for(int j=1;j<=n-1;j++){
            // System.out.print("");
            // }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /////////
        // int num=1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num+" ");
        // num++;
        // }
        // System.out.println();
        // }

        // [pattern 1] 0 and 1

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        /// if condition
        // if (number1 == number2) {
        // System.out.println("both numbers are equal");
        // } else {
        // if (number1 > number2) {
        // System.out.println("number1 is greater than number2");
        // } else {
        // System.out.println("number2 is greater than number1");
        // }
        // }
        /// else if condition
        ////////////////////////
        ///////////////////////

        // if (number1 % 2 == 0) {
        // System.out.println("number1 is even");
        // } else if (number1 % 2 != 0) {
        // System.out.println("number1 is odd");
        // } else {
        // System.out.println("number1 is not even or odd");
        // }

        /////////////////////////
        ///////////////////////
        ////// looops ////

        /// while loops
        int i = 0;
        // while (i < 5) {
        // System.out.println("hello ali");
        // i++;
        // }
        ////////////// do while loop
        // do {
        // System.out.println("hello ali " + i);
        // i++;
        // } while (i < 5);
        ////////////////////////////////////////
        //////////////////////////////////////
        // pattrens/////////////

    }
}
