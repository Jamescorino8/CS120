import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Math;
 
/**
* 
* @James Corino
* @01/14/22
*/
public class Main
{
   /*
    * Private global static (class) variables.
    *
    * These variables can be used anywhere in this class.  You do not need to
    * pass them as parameters between methods.
    *
    * You may not remove or add any of these variables.
    */
  
   //The 5 winning lottery numbers.
   private static int ball1, ball2, ball3, ball4, ball5;
  
   private static int num0Match, num1Match, num2Match, num3Match, num4Match, num5Match;
   
   private static int ticketsPlayed;
  
   private static double payoutPerTicket1, payoutPerTicket2, payoutPerTicket3, payoutPerTicket4, payoutPerTicket5, totalMoney;

   public static double oneMatchWin, twoMatchWin, threeMatchWin, fourMatchWin, fiveMatchWin, totalPayout;
  
   /**
    * This method is used to run the lottery. 
    * DO NOT EDIT THIS METHOD.
    *
    * @param args No command line arguments are necessary.
    */
   public static void main(String args[])
   {
       setWinningNumbers();
 
       Scanner sc = new Scanner(System.in);
       System.out.print("\nEnter the input file name:  ");
       String fileName = sc.nextLine();
       sc.close();
 
       try
       {   
           readInData(fileName);
       }
       catch (FileNotFoundException fne)
       {
           System.out.println("The input data file cannot be found.");
           System.exit(0);
       }
 
       printOutput();
   }
 
   /**
    * The method sets the global static (class) variables ball1, ball2,
    * ..., ball5 to random values in [1, 39].  Each of the 5 numbers
    * selected must be unique.  E.g.,
    *
    * {17, 9, 28, 12, 1}
    *
    * is a valid selection, but
    *
    * {17, 9, 28, 12, 17}
    *
    * is not a valid selection because 17 was selected twice.
    */
   private static void setWinningNumbers()
   {
       // This code sets the winning numbers to 15, 23, 9, 4, and 24.
       // These are not random! Testing is easier if they are not
       // random.  But once you have everything working for these values,
       // modify this code so that it picks 5 (unique) random values.
      
       Random ball = new Random();
 
       ball1 = ball.nextInt (40) + 1;
       ball2 = ball.nextInt (40) + 1;
       ball3 = ball.nextInt (40) + 1;
       ball4 = ball.nextInt (40) + 1;
       ball5 = ball.nextInt (40) + 1;
   }
 
   /**
    * This method reads all of the lottery tickets from the input file.
    * As each ticket is read, the number of matches is recorded by updating
    * the appropriate global static (class) variable.  E.g., if the ticket
    * read matches 3 of the winning numbers, num3Match is incremented by 1.
    *
    * @param fileName The name of the input file.  This file must contain
    * five integers per line, separated by spaces.
    */
   private static void readInData(String fileName) throws FileNotFoundException
   {
     Scanner sc = new Scanner(new File(fileName));
     int i = 0;
     int matches = 0;
     int g = 0;
     while(sc.hasNext()){
       while (i < 5){
         ticketsPlayed++; //total amount of numbers played. /5 for tickets
         totalMoney += 1.00; //total amount of cash (same as ^ but a double)
         g = sc.nextInt();
         if (g == ball1) {
           matches++;
         }
         else if (g == ball2) {
           matches++;
         }
         else if (g == ball3) {
           matches++;
         }
         else if (g == ball4){
           matches++;
         }
         else if (g == ball5){
           matches++;
         }
         else {
           matches += 0;
         }
         i++;
       }
     if (matches == 1){
         num1Match++;
       }
     else if (matches == 2){
         num2Match++;
       }
     else if (matches == 3){
         num3Match++;
       }
      else if (matches == 4){
         num4Match++;
       }
     else if (matches == 5){
         num5Match++;
       }
     else {
         num0Match++;
       }
     matches = 0;
     i = 0;
     }
   sc.close();
 
   if (num1Match >= 1){
     payoutPerTicket1 = ((ticketsPlayed/5) *.10) / num1Match;
     oneMatchWin = num1Match * payoutPerTicket1;
   }
   else {
     payoutPerTicket1 = 0;
     oneMatchWin = 0;
   }
   if (num2Match >= 1){
     payoutPerTicket2 = ((ticketsPlayed/5) * .12) / num2Match;
     twoMatchWin = num2Match * payoutPerTicket2;
   }
   else {
     payoutPerTicket2 = 0;
     twoMatchWin = 0;
   }
   if (num3Match >= 1){
     payoutPerTicket3 = ((ticketsPlayed/5) * .15) / num3Match;
     threeMatchWin = num3Match * payoutPerTicket3;
   }
   else {
     payoutPerTicket3 = 0;
     threeMatchWin = 0;
   }
   if (num4Match >= 1){
     payoutPerTicket4 = ((ticketsPlayed/5) * .18) / num4Match;
     fourMatchWin = num4Match * payoutPerTicket4;
   }
   else {
     payoutPerTicket4 = 0;
     fourMatchWin = 0;
   }
   if (num5Match >= 1){
     payoutPerTicket5 = ((ticketsPlayed/5) * .20) / num5Match;
     fiveMatchWin = num5Match * payoutPerTicket5;
   }
   else {
     payoutPerTicket5 = 0;
     fiveMatchWin = 0;
   }
  
   totalPayout = oneMatchWin + twoMatchWin + threeMatchWin + fourMatchWin + fiveMatchWin;
   totalPayout = (ticketsPlayed/5) - totalPayout;
   }
 
   /**
    * This method prints the output formatted as shown in the example
    * output.
    */
   private static void printOutput()
   {
       //Add your code here.
       System.out.println("The winning numbers are: " + ball1 + " " + ball2 + " " + ball3 + " " + ball4 + " " + ball5 + "\n");
 
       System.out.println("Number of tickets played: " + (ticketsPlayed/5) + "\n");
 
       System.out.println("Numbers Matched     Number Tickets     Payout Per Matched Ticket     Total Payout\n");
      
       System.out.println("---------------     --------------     -------------------------     ------------");       
      
       System.out.printf("       5          %,8d", num5Match);
       System.out.printf("                 $%1.2f", payoutPerTicket5);
       System.out.print("                   ");
       System.out.printf("     $%1.2f\n", fiveMatchWin);
 
       System.out.printf("       4          %,8d", num4Match);
       System.out.printf("                 $%1.2f", payoutPerTicket4);
       System.out.print("                 ");
       System.out.printf("     $%1.2f\n", fourMatchWin);
 
       System.out.printf("       3          %,8d", num3Match);
       System.out.printf("                 $%1.2f", payoutPerTicket3);
       System.out.print("                  ");
       System.out.printf("     $%1.2f\n", threeMatchWin);
 
       System.out.printf("       2          %,8d", num2Match);
       System.out.printf("                 $%1.2f", payoutPerTicket2);
       System.out.print("                   ");
       System.out.printf("     $%1.2f\n", twoMatchWin);
 
       System.out.printf("       1          %,8d", num1Match);
       System.out.printf("                 $%1.2f", payoutPerTicket1);
       System.out.print("                   ");
       System.out.printf("     $%1.2f\n", oneMatchWin);
 
       System.out.printf("       0          %,8d", num0Match);
       System.out.print("                 $" + "0.00" + "                        $" + "0.00");
      
       System.out.print("\nProfit:   ");
       System.out.printf("$%1.2f", totalPayout);
   }
}
 

