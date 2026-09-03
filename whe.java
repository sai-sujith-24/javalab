class whe {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};

        boolean equal = true;

        if (a.length != b.length) {
            equal = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal)
            System.out.println("Arrays are equal");
        else
            System.out.println("Arrays are not equal");
    }
}