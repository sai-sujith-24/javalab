class rep {
    public static void main(String[] args) {
        int[] a = {5, 3, 4, 3, 7, 5};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("First Repeated = " + a[i]);
                    return;
                }
            }
        }

        System.out.println("No repeated element");
    }
}