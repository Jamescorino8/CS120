import java.util.Scanner; 
/**
  * Project 1 - Shamrocks and Finances
  * @author James nicholas
  * @version 9/22/21
  */

class Main {
  /**
   * This driver method calls shamrock() which will print
   * out the Shamrock poem. 
   */
  public static void main(String[] args) {
  //shamrock(); 
  finances();
  }
  
  //This method prints out the Shamrock poem.
   
  public static void shamrock() {
    //char sham5 = '\u2618 \u2618 \u2618 \u2618 \u2618';
    char sham = '\u2618';
    char coin1 = '\u2460';
    char coin2 = '\u2461';
    char coin3 = '\u2462';
    char coin4 = '\u2463';
    char coin5 = '\u2464';
   /** TITLE */
     System.out.println("" + sham + sham + sham + sham + sham + " Five Little Shamrocks " + sham + sham + sham + sham + sham + "\n");
   /** Paragraph 1 */
     System.out.println("\t" + " " + coin1 + " Green " + sham + " s, in the mourning dew, \n \t Another one sprouted, \n \t and then there were " + coin2 + "\n");
   /** Paragraph 2 */  
     System.out.println("\t" + " " +coin2 + " Green " + sham +  " s, growing beneath a tree; \n \t Another one sprouted, \n \t and then there were " + coin3 + ".\n");
   /** Paragraph 3 */    
     System.out.println("\t"+ " " +coin3 + " Green " + sham + " s, by the cottage door; \n \t Another one sprouted, \n \t and then there were " + coin4 +  ".\n");
   /** Paragraph 4 */ 
     System.out.println("\t " + coin4 + " Green " + sham + " s, near a beehive \n \t Another one sprouted, \n \t and then there were " + coin5 + ".\n");
   /** Paragraph 5 */ 
     System.out.println("\t " + sham + " Little " + sham + " s, bright and emerald green, \n \t Think of all the luck \n \t these " + sham + " s will bring.\n");
  }

public static void finances() {

    Scanner keyboard = new Scanner(System.in);
    double PV; //prensentvalue 
    System.out.print("Enter the present value of your loan:\t");
    PV = keyboard.nextDouble();
    double t; //time
    System.out.print("Enter the length of your loan in years:\t");
    t = keyboard.nextDouble();
    double r; //rate 
    System.out.print("Enter the anual interest rate on your loan:\t");
    r = keyboard.nextDouble();
    double n = t * 12;
    double mR = r / 12;
    mR = mR / 100;
    //double P = Math.round((mR*PV / (1 -(Math.pow((1+mR), (-1 * n)))))*100.0) / 100.0;
    double CF = (mR*PV / (1 -(Math.pow((1+mR), (-1 * n)))));
    System.out.printf("\nYour monthly payment is $ %.2f%n", CF);
    double tP = CF * n;  //total payment 
    //double tP = Math.round((CF * n)*100.0) / 100.0;  //total payment 
    System.out.printf("Your payment at the end of the loan is $ %.2f%n", tP);
    double FVa = ((CF * ((Math.pow(Math.E, (mR*n))-1) / ((Math.pow(Math.E, mR))-1))));
    System.out.printf("If you invested %.2f at the same interst rate for the same amount of time, the total payment at the end of the loan is $ %.2f", CF, FVa);

  
}

}