class gorr {
    public static void main(String[] args) {
        int[] a = {10, 5, 10, 20, 10, 30};

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 10)
                count++;
        }

        System.out.println("Count of 10 = " + count);
    }
}