
public class arrPalindrom {

    public static void main(String[] args) {
        System.out.println("welcome check array palindrom or not");

        int[] arr = arrEnter.arrayUti();
        boolean pal = Palind(arr);
        System.out.print("Array is :");
        arrEnter.DisplayArr(arr);
        if (pal) {
            System.out.println("Arrays is palindromes");
        } else {
            System.out.println("Not palindrome");
        }

    }

    public static boolean Palind(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
            i++;
        }

        return true;
    }
}
