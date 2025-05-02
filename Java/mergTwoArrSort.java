
public class mergTwoArrSort {

    public static void main(String[] args) {
        System.out.println("welcome two array merg");
        int[] arr1 = arrEnter.arrayUti();
        int[] arr2 = arrEnter.arrayUti();
        int[] mer = Merg(arr1, arr2);
        arrEnter.DisplayArr(mer);
    }

    public static int[] Merg(int[] ar1, int[] ar2) {
        int i = 0, j = 0, k = 0;
        int newSize = ar1.length + ar2.length;
        int[] newArr = new int[newSize];
        while (i < ar1.length || j < ar2.length) {
            if (j == ar2.length || (i < ar1.length && ar1[i] < ar2[j])) {
                newArr[k] = ar1[i];
                i++;
                j++;
            } else {
                newArr[k] = ar2[j];
                k++;
                j++;
            }
        }
        return ar1;
    }
}
