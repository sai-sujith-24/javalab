class ten {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        boolean sorted = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted)
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is Not Sorted");
    }
}