
public class arrays {

    public static void main(String[] args) {
        System.out.println("Welcome in arrays");
        int[] arr = arrEnter.arrayUti();
        double sum = Sum(arr);
        double avg = Avg(arr);
        System.out.println("Sum complete: " + sum);
        System.out.println("Avg complete: " + avg);

    }

    public static long Sum(int[] ar) {
        long sum = 0;
        int i = 0;
        while (i < ar.length) {
            sum += ar[i];
            i++;
        }

        return sum;

    }

    public static double Avg(int[] ar) {
        double avg = Sum(ar);

        return avg / ar.length;

    }
}
