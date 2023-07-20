public class Main {
    // Example 1: Function that adds two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Challenge 1: Create a method that multiplies two doubles
    public static double multiplyDoubles(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("6 plus 7 is: " + add(6, 7)); // Example 1

        double result = multiplyDoubles(2.0, 4.5);
        System.out.println(result); // Challenge 1
        // If the function is correctly implemented, it should print 9.0 when we run it
    }
}
