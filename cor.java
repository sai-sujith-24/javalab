class cor {
    String name;
    int age;

    cor(){
        name = "Unknown";
        age = 0;
    }

    cor(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        cor s1 = new cor();
        cor s2 = new cor("Ravi", 20);

        s1.display();
        s2.display();
    }
}