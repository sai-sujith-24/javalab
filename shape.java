interface shape {
    void area();
}

class Circle implements Shape {
    public void area() {
        int r = 5;
        System.out.println("Area = " + (3.14 * r * r));
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        c.area();
    }
}