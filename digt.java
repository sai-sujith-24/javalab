class digt {
    public static void main(String[] args) {
        int n = 583927;
        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 != 0)
                count++;

            n = n / 10;
        }

        System.out.println("Odd Digits = " + count);
    }
}