import java.util.Scanner;

/**
 * InnerPiller
 */
interface Ali {
    public void show1();

}

abstract class ar {

    abstract void show1();
}

class abbas implements Ali {
    public void show1() {
        System.out.println("show abbas");
    }
}

class info {

    int[] no;
    String[] name;
    int[] marks;

    public void showInfo() {
        for (int i = 1; i < no.length; i++) {
            System.out.println(no[i]);
            System.out.println(name[i]);
            System.out.println(marks[i]);

        }
    }

}

public class Piller {
    public static void main(String[] args) {
        // Pillar 1: Inheritance
        Scanner sc = new Scanner(System.in);

        info i = new info();
        i.showInfo();

    }
    // abbas ali = new abbas();
    // ali.show1();

    // Pillar 2: Polymorphism
    // Pillar 3: Abstraction
    // Pillar 4: Encapsulation

}
