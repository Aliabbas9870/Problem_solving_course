
import java.util.Scanner;

class reverseNum {

    public static void main(String[] args) {
        System.out.println("");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int reverse = revers(num);
        System.out.println("revers : " + reverse);

    }

    public static int revers(int n) {

        int re = 0;
        while (0 < n) {
            int digit = n % 10;
            re = re * 10 + digit;
            n /= 10;
        }
        return re;
    }

}
