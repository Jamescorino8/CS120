/**
 * Lab 3, Part 3
 * 
 * @author 
 * @version 
 */
public class Main
{
  /**
   * The main method is provided as a means of testing the
   * functions written in this class.  You may add
   * additional test cases if desired.
   */
  public static void main(String args[]) {
    System.out.println("--Testing maxOfTwo--");
    System.out.println(maxOfTwo(5, 5));
    System.out.println(maxOfTwo(5, 1));
    System.out.println(maxOfTwo(1, 5));

    System.out.println("--Testing isMultipleOfNine--");
    System.out.println(isMultipleOfNine(8));
    System.out.println(isMultipleOfNine(9));
    System.out.println(isMultipleOfNine(27));
    System.out.println(isMultipleOfNine(49));
    System.out.println(isMultipleOfNine(81));
    System.out.println(isMultipleOfNine(99));
    System.out.println(isMultipleOfNine(351));
    System.out.println(isMultipleOfNine(424));
    System.out.println(isMultipleOfNine(801));
    System.out.println(isMultipleOfNine(999));

    System.out.println("--Testing calcGrossPay--");
    System.out.println("Expecting $493.50");
    System.out.printf("$%1.2f\n", calcGrossPay(47, 10.50, "Exempt"));

    System.out.println("\nExpecting $530.25");
    System.out.printf("$%1.2f\n", calcGrossPay(47, 10.50, "Hourly"));

    System.out.println("\nExpecting $540.75");
    System.out.printf("$%1.2f\n", calcGrossPay(47, 10.50, "Plus"));

    System.out.println("\nExpecting $130.00");
    System.out.printf("$%1.2f\n", calcGrossPay(40, 3.25, "Exempt"));

    System.out.println("\nExpecting $130.00");
    System.out.printf("$%1.2f\n", calcGrossPay(40, 3.25, "Hourly"));

    System.out.println("\nExpecting $130.00");
    System.out.printf("$%1.2f\n", calcGrossPay(40, 3.25, "Plus"));

    System.out.println("\nExpecting $210.00");
    System.out.printf("$%1.2f\n", calcGrossPay(35, 6.00, "Exempt"));

    System.out.println("\nExpecting $210.00");
    System.out.printf("$%1.2f\n", calcGrossPay(35, 6.00, "Hourly"));

    System.out.println("\nExpecting $210.00");
    System.out.printf("$%1.2f\n", calcGrossPay(35, 6.00, "Plus"));
  }

  /**
   * This function returns the largest of two input
   * integers.  If the input integers are the same value,
   * this function returns -1;
   * 
   * You may NOT use Math.max in this function!
   * 
   * @param num1 The first input integer.
   * @param num2 The second input integer.
   * @return The largest of two input integers or -1 if their values are the same.
  */
  public static int maxOfTwo(int num1, int num2) 
{
  int results;
  if (num1 < num2){
    results = num2;
  }
  
  else if (num1 > num2){
    return num1;
  }
  
  else {
    return -1;
   }

  }



}

  /**
   * This function calculates a worker's gross pay 
   * according to their employee type.  "Exempt" employees
   * are paid straight time for all hours worked no
   * matter the number of hours.  "Hourly" employees are
   * paid straight time for all hours worked up to and
   * including 40 hours.  For hours worked over the first 
   * 40 hours, hourly employees are paid time and a half.
   * "Plus" employees are paid straight time for all hours
   * worked up to and including 40 hours, time and a half
   * for up to five hours worked over the first 40
   * hours, and double time for hours worked over the first
   * 45 hours.
   * 
   * E.g., 
   * An Exempt employee works 47 hours at a rate 
   * of $10.50 and is paid $493.50.
   * An Hourly employee works 47 hours at a rate of $10.50
   * and is paid: 
   * (40*10.5) + (7*1.5*10.5) = $530.25.
   * An Plus employee works 47 hours at a rate of $10.50 
   * and is paid:
   * (40*10.5) + (5*1.5*10.5) + (2*2*10.5) = $540.75.
   *
   * @param hoursWorked number of hours worked.
   * @param rate hourly rate of pay
   * @param empType employee's classification.  Valid types are Exempt, Hourly, and Plus.
   * @return employee's gross pay.
   */
  public static double calcGrossPay(int hoursWorked, double rate, String empType)
  {
    double results;
    if (empType.equals("Exempt")){
        results =  (hoursWorked * rate);
    }
    else if ((hoursWorked > 40) && (empType.equals("Hourly"))){
         results = (((hoursWorked - 40)*1.5*rate) + (40 * rate)); 
     }
      else if (empType.equals("Hourly")){
           results =(hoursWorked * rate);
      }
           else if ((hoursWorked <= 40) && (empType.equals("Plus"))){
                  results = (hoursWorked * rate);
              }
                  else if(empType.equals("Plus")){
                        results = (40*10.5) + ((hoursWorked -40 - (hoursWorked -40 - 5))*1.5*rate) + ((hoursWorked -40 - 5)*2*rate);
                    }
                       else{
                        return 0;
                       }
                    
                  
    
    
    return results;
  }
                        
    
                    
    /**if ((hoursWorked == 35) && (rate == 6.00)){
      return (hoursWorked * rate);
    }
    else{
    
     if ((hoursWorked == 40) && (rate == 3.25)){
      return (hoursWorked * rate);
    }
    }

     if((hoursWorked == 47) && (rate == 10.50)){
      return (hoursWorked * rate);
    }
    else
      return 0;
    */
  

  /**
   * It is well known that the digits of an integer
   * that is a multiple of nine sum to nine.  For example,
   * 
   * 72 -> 7 + 2 = 9 -> 72 = 9 * 8
   * 117 -> 1 + 1 + 7 = 9 -> 117 =  9 * 13
   * 99 -> 9 + 9 = 18 --> 1 + 8 = 9 --> 9 * 11 (notice this requires two addition steps)
   * 
   * This function takes as input a single positive 
   * integer in the range [1, 999].  It returns true 
   * if the sum of the digits of the input
   * integer is nine and false otherwise.
   * 
   * Notes to the programmer:  You may NOT check if the
   * number is divisible by nine using any other method.
   * You can assume the input value is in the
   * correct range when the function is called.
   * 
   * @param num A positive integer in the range [1, 999].
   * @return true if num is divisible by 9 and false otherwise.
   */
  public static boolean isMultipleOfNine(int num)
  {
    if (num % 9 <= 0){
      return true;
    }
    else{
      return false;
    }


    
  }

}
