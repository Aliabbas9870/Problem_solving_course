
import java.util.Scanner;

public class checkNumber {

    public static void main(String[] args) {
        System.out.println("Welcome check the number -ve ,+ve and 0 ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Your number is +ve: " + num);
        } else if (num == 0) {
            System.out.println("Your number is 0: " + num);
        } else {
            System.out.println("Your number is -ve: " + num);
        }
    }
}
