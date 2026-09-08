class Grandparent {
    void display1() {
        System.out.println("Grandparent");
    }
}

class Parent extends Grandparent {
    void display2() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void display3() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Child c = new Child();

        c.display1();
        c.display2();
        c.display3();
    }
}