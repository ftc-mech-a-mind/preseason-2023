public class SimpleMath {
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static boolean isEven(int a) {
        int remainder = a % 2; 
        if (remainder == 0) {
          //If there's no remainder from dividing by 2, then the number has to be even  
          return true;
        } else {
            return false;
        }
    }

    public static boolean isEven2(int a) {
        return (a % 2) == 0;
    }
    //Alternate function, does the same thing as isEven but is more concise 
    //if you can understand it, write your functions like this
    //If it doesn't make sense, just write it the way you did in isEven

  public static void main(String[] args) {
    double result = multiply(2.0, 4.5);
    System.out.println("Multiplying 2.0 and 4.5");
    System.out.println(result);
    //If our function is correct, this code should print 9.0 when we run it

    System.out.println("Is 6 even?");
    System.out.println(isEven(6));
    //If our function is correct, this code should print true when we run it

    System.out.println("Is 7 even?");
    System.out.println(isEven(7));
    //If our function is correct, this code should print false when we run it
  }
}
