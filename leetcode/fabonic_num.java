class fabonic_num {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int n = 5;
        if (0 == n) {
            System.out.print(first);
        } else if (n < 0) {
            System.out.print("we cannot this number fabonic");
        } else if (n == 1) {
            System.out.print(first + " " + second);
        } else {
            System.out.print(first + " " + second + " ");
            for (int i = 0; i <= n; i++) {

                int third = first + second;
                System.out.print(third + " ");
                first = second;
                second = third;

            }

        }

    }
}
