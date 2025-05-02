public class Strings {
    public static void main(String[] args) {
        String name;
        String name1="ali";
        // Scanner sc=new Scanner(System.in);/\
        // name=sc.nextLine();
        // if(name.compareTo(name1)==0){
        //     System.out.println(name);

        // }
        // else{
        //     System.out.println("not equ");
        // }

////////// string builder 

StringBuilder sb=new StringBuilder("abbas");
// System.out.println(names);
sb.setCharAt(1,'e');
System.out.println(sb);
sb.insert(0, 'H');
System.out.println(sb);
sb.delete(2, 4);
System.out.println(sb);
    }
}
