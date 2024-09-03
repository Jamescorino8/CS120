 import java.util.Scanner;

/**
 * Lab 2
 * @author JAMES
 * @version 14/9/21
 */
 class Main {
  public static void main(String[] args) {
   /**  quadratic(); */
    /**part2();*/
    evaluation();
  }
  /**
   * This method should prompt the user for
   * 3 integers a, b, and c and then print
   * the roots of the quadratic equation 
   * ax^2 + bx + c.  
   */
  public static void quadratic() {
    Scanner keyboard = new Scanner(System.in);
    String inputSentence = "";
    int a;
    System.out.print("Enter an integer for a: ");
    a = keyboard.nextInt();
    int b;
    System.out.print("Enter an integer for b: ");
    b = keyboard.nextInt();
    int c;
    System.out.print("Enter an integer for c: ");    
    c = keyboard.nextInt();
    double x1 = (-b + Math.sqrt(Math.pow(b, 2)-4*(a*c))) / (2*a);
    double x2 = (-b - Math.sqrt(Math.pow(b, 2)-4*(a*c))) / (2*a);
    System.out.println("Quadratic Roots: ");
    System.out.println(x1);
    System.out.println(x2);

  }

  public static void part2() {

 String str = "ABCDE";
 System.out.println(str + ' ' + (5 < 7));
 
  }

/** 
*This progrom should promt the user to give 2 numbers, x and y.
*This numbers will then be added together, subracted, multiplied, 
*divided, percentage, and display the smaller of the two. 
*/
  public static void evaluation() {
  System.out.println("Demo Java operators");
  Scanner keyboard = new Scanner(System.in);
    String inputSentence = "";
    int x;
    System.out.print("Enter an integer for x: ");
    x = keyboard.nextInt();
    int y;
    System.out.print("Enter an integer for y: ");
    y = keyboard.nextInt();
    int q1 = (x+y);
    int q2 = (x-y);
    int q3 = (x*y);
    int q4 = (x/y);
    int q5 = (x%y);
    int q6 = Math.max(x, y);
    int q7 = Math.min(x, y);
    
    System.out.println("x + y = "+ q1);
    System.out.println("x - y = " + q2);
    System.out.println("x * y = " + q3);
    System.out.println("x / y = " + q4);
    System.out.println("x % y = " + q5);
    System.out.println("Math.max(x, y) = " + q6);
    System.out.println("Math.min(x, y) = " + q7);


}
}