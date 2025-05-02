
import java.util.Scanner;
public class Opp1 {
    // public static void printFact(int n) {
    // if (n < 0) {
    // System.out.println("Invalid input");
    // return;
    // }
    // int fact = 1;
    // for (int i = 1; i <= n; i++) {
    // fact = fact * i;
    // }
    // System.out.println("Factorial of " + n + " is = " + fact);
    // }
    public static void main(Strings args[]) {
        System.out.println("hello func");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int m = sc.nextInt();
        // printFact(m);

        ////////////////////////
        ////////
        // faboic series
        ///////////
        // int n = sc.nextInt();

        // int a = 0, b = 1;

        // System.out.println(a + " ");

        // if (n > 0) {
        //     // find nth term
        //     for (int i = 1; i <= n; i++) {
        //         System.out.println(b + " ");
        //         // the concept below is called swapping
        //         int temp = b;
        //         b = a + b;
        //         a = temp;
        //     }

        //     System.out.println();
        // }

        ///////////////
        ///// 2 D arrays ///////
        ////  [row][col]      ////
        int ab=5;
        int ba=5;
        int[][] no=new int[ab][ba];

         for(int i=1;i<ab;i++){
            for(int j=1;j<ba;j++){
                no[i][j]=sc.nextInt();
            }
         }

         for(int j=1;j<ab;j++){
           for(int k=1;k<ba;k++){
                System.err.print(no[j][k]+" ");
            }
          System.out.println();
         }

     
         int x=5;

         for(int j=1;j<ab;j++){
            for(int k=1;k<ba;k++){
              if (no[j][k]==x) {
                System.err.print("found your index ("+j+" "+k+" )");
              }
                 
             }
           
          }



    }
}
