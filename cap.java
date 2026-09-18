class cap {
    private int marks;

    void setMarks(int m) {
        marks = m;
    }

    int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        cap s = new cap();

        s.setMarks(85);

        System.out.println("Marks = " + s.getMarks());
    }
}