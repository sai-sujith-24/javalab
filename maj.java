class maj {
    public static void main(String[] args) {
        int[] a = {2, 2, 1, 2, 3, 2, 2};

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j])
                    count++;
            }

            if (count > a.length / 2) {
                System.out.println("Majority Element = " + a[i]);
                break;
            }
        }
    }
}