class fact {
    public static void main(String[] args) {
        int n = 49;
        boolean found = false;

        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Perfect Square");
        else
            System.out.println("Not a Perfect Square");
    }
}