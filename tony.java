class tony {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 25, 30, 35};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                evenSum += a[i];
            else
                oddSum += a[i];
        }

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum);
    }
}