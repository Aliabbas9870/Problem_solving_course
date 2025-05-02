class powercheck {
    public static void main(String[] args) {
        int n = 1;
        if (n < 1) {

            System.out.println("stop:");
        } else if (n == 1) {
            System.out.println("powercheck true");
        } else {

            while (n % 2 == 0) {
                n = n / 2;
            }
            if (n == 1) {
                System.out.println("this number is power of 2");

            } else {
                System.out.println("this number is not power of 2");

            }
        }
    }
}
