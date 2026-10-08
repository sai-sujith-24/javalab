class FirstLastDigitSum {
    public static void main(String[] args) {
        int n = 5832;

        int last = n % 10;
        int first = n;

        while (first >= 10) {
            first = first / 10;
        }

        System.out.println("Sum = " + (first + last));
    }
}