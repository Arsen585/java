class Counter {

    static int count = 7;

    static void increment() {
        count++;
    }

    public static void main(String[] args) {
        increment();
        increment();
        increment();

        System.out.println("Count: " + count);
    }
}
