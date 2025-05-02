
import java.util.Scanner;

class Palindrom {

    public static void main(String[] args) {
        System.out.println("Welcome the check the number is palidrom?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int res1 = revers(num);
        System.out.println("Number reverse is: " + num + " revers is:  " + res1);
        boolean re = Palindrome(num);
        if (re) {
            System.out.println("Your number is palidrome: " + re);
        } else {
            System.out.println("Not! Your number is not palindrome");
        }

    }

    public static boolean Palindrome(int n) {
        int res1 = revers(n);
        return n == res1;
    }

    public static int revers(int n) {
        int re = 0;
        while (0 < n) {
            int dig = n % 10;
            re = re * 10 + dig;
            n /= 10;
        }
        return re;
    }
}
