
import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
        System.out.println("WElcome to classify the even and odd");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("Number is even: " + num);
        } else {
            System.out.print("Number is odd: " + num);
        }
    }
}
