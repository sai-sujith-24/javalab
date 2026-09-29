class fury {
    public static void main(String[] args) {
        int n = 123456;
        int position = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (position % 2 == 0)
                sum += digit;

            n = n / 10;
            position++;
        }

        System.out.println("Sum = " + sum);
    }
}