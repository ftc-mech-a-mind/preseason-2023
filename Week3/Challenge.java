public class Challenge {
    public static boolean isDivisibleBy5(int a) {
        return (a % 5) == 0;
    }

    public static void main(String[] args) {
        boolean test = isDivisibleBy5(10);

        System.out.println(test);
        //should print true
    }
}
