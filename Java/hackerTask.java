
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.print("Weird");
        } else {
            if (n % 2 == 0 && n > 20) {
                System.out.print("Not Weird");
            } else if (n % 2 == 0 && 6 > 20) {
                System.out.print("Weird");
            } else {
                if (2 > 5) {
                    System.out.print("Not Weird");
                } else {
                    System.out.print("Weird");
                }
            }
        }
    }
}
