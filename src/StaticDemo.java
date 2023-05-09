public class StaticDemo {

    public static int count;

    static {
        System.out.println("Static block is initialized.");
        count = 280;
    }

    public static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println("Initial count: " + count);

        incrementCount();
        System.out.println("After incrementing count: " + count);

        incrementCount();
        System.out.println("After incrementing count again: " + count);
    }
}
