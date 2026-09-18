class occ {
    public static void main(String[] args) {
        int[] a = {2, 4, 2, 6, 2, 8, 4};
        int target = 2;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target)
                count++;
        }

        System.out.println("Occurrence = " + count);
    }
}