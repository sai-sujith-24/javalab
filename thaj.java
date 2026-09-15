class thaj {
    public static void main(String[] args) {
        int[] a = {5, 12, 7, 20, 3, 15};

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 10)
                count++;
        }

        System.out.println("Elements less than 10 = " + count);
    }
}