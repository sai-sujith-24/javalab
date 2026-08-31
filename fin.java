class fin {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 30, 20, 10};

        for (int i = 0; i < a.length; i++) {
            boolean counted = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    counted = true;
                    break;
                }
            }

            if (!counted) {
                int count = 0;

                for (int j = 0; j < a.length; j++) {
                    if (a[i] == a[j])
                        count++;
                }

                System.out.println(a[i] + " = " + count);
            }
        }
    }
}