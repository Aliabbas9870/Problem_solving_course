
import java.util.Scanner;

public class leapYear {

    public static void main(String[] args) {
        System.out.println("Welcome in check the year is leap or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if (year % 4 == 0 || (year % 400 == 0 && year % 100 != 0)) {
            System.out.print("Year is leap: " + year);
        } else {
            System.out.println("Year is not leap year: " + year);
        }

    }

}
