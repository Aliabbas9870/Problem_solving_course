class palindrom {

    public static void main(String[] args) {

        int org = 21;
        int revx = 0;
        int x = org;
        if (0 > x) {
            System.out.print("we cannot this number palindrome");
        } else {
            while (x > 0) {

                int d = x % 10;
                revx = revx * 10 + d;
                x = x / 10;
            }
            if (org == revx) {
                System.out.print("this number is palindrome" + org + " " + revx);
            } else {
                System.out.print("this number is not palindrome");
            }

        }

    }
}