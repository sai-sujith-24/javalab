class ada {
    public static void main(String[] args) {
        int[] a = {25, 60, 75, 40, 90, 30};

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 50)
                count++;
        }

        System.out.println("Count = " + count);
    }
}