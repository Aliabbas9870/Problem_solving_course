import java.util.*;
public class Clas {
    public static void main(String[] args) {

        System.out.println("Hello Java");
        Scanner sc=new Scanner(System.in);
        name na = new name();
        String name = sc.nextLine();
        int num = sc.nextInt();
        na.info(name,num);
    }
}
class name {
    String name = "abbas";
    public void info(String name,int num) {
        System.out.println("Im from main class " + name+" "+num);
        System.out.println(this.name);
    }
} 