class kin {
    public static void main(String[] args) {
        int n = 234;
        int product = 1;

        while (n > 0) {
            product = product * (n % 10);
            n = n / 10;
        }

        System.out.println("Product = " + product);
    }
}