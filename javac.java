class javac {
    public static void main(String[] args) {
        int n = 583214;
        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit < 5)
                count++;

            n = n / 10;
        }

        System.out.println("Digits less than 5 = " + count);
    }
}