
class ReversArry {

    public static void main(String[] args) {
        System.out.println("Welcome to reverse array");
        int[] arr = arrEnter.arrayUti();
        System.out.print("Orginal array: ");
        arrEnter.DisplayArr(arr);
        int[] revArr = RevArr(arr);
        System.out.print("revers array: ");
        arrEnter.DisplayArr(revArr);

    }

    public static int[] RevArr(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = swap;
            i++;
        }
        return arr;
    }

}
