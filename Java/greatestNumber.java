
import java.util.Scanner;

public class greatestNumber {

    public static void main(String[] args) {
        System.out.println("Welcome check the greatest number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 3 : ");
        int num2 = sc.nextInt();

        if (num >= num1 && num >= num2) {
            System.out.println("Number 1 is greater" + num);
        } else if (num1 >= num2) {
            System.out.println("Number 2 i s greater " + num1);
        } else {
            System.out.println("Number3 is greater " + num2);
        }

    }
}
