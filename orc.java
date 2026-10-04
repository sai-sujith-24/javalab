class orc {
    public static void main(String[] args) {
        int[] a = {5, 15, 25, 60, 40, 8, 50};

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 10 && a[i] <= 50)
                count++;
        }

        System.out.println("Count = " + count);
    }
}