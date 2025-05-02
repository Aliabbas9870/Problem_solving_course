
import java.util.Scanner;

class tempConvert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in Convertor");
        System.out.print("Enter F: ");
        float feh = sc.nextFloat();
        double cel = (feh - 32) * 5 / 9;

        ///
//  cel *9/5+32=feh
System.out.print("Enter C: ");
        float c = sc.nextFloat();
        double fe = (cel + 32) * 9 / 5;
        //
        System.out.println("Convert: C" + cel);
        System.out.println("Convert: F" + fe);

    }
}
