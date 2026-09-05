class ja {
    public static void main(String[] args) {
        int[] a = {1, 5, 10, 20};
        int[] b = {5, 10, 15, 20};
        int[] c = {2, 5, 10, 20};

        for (int i = 0; i < a.length; i++) {
            boolean foundB = false;
            boolean foundC = false;

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    foundB = true;
                    break;
                }
            }

            for (int j = 0; j < c.length; j++) {
                if (a[i] == c[j]) {
                    foundC = true;
                    break;
                }
            }

            if (foundB && foundC)
                System.out.print(a[i] + " ");
        }
    }
}