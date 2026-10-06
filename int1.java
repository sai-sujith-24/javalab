class int1 {
    public static void main(String[] args) {
        int n = 583927;
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Number of Digits = " + count);
    }
}