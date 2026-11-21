class Bike {
    final void run() {
        System.out.println("running");
    }
}

class Honda extends Bike {
    // A final method cannot be overridden. Use a different method for extra behavior.
    void runSafely() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
        honda.runSafely();
    }
}
