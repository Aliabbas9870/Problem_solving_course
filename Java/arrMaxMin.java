
public class arrMaxMin {

    public static void main(String[] args) {
        System.out.println("welcome check max and min value");
        int[] arr = arrEnter.arrayUti();
        Max(arr);
        int min = Min(arr);
        int max = Max(arr);
        System.out.println("Min value is: " + min);
        System.out.println("Max value is: " + max);
    }

    public static int Max(int[] arr) {
        // int max = Integer.MIN_VALUE;
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int i = 0;
        int max = arr[0];
        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];
            }
            i++;
        }

        return max;

    }

    public static int Min(int[] arr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;

        }

        return min;
    }
}
