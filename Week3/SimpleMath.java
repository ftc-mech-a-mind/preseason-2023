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

  public static void main(String[] args) {
    double result = multiply(2.0, 4.5);
    System.out.println(result);
    //If our function is correct, this code should print 9.0 when we run it
  }
}
