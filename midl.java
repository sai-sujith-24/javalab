class midl{
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        int middle = a.length / 2;
        int sum = a[0] + a[middle];

        System.out.println("Sum = " + sum);
    }
}