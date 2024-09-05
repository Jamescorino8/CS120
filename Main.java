import java.util.Scanner;

/**
 * Lab 4, Part 2, Valid Dates
 * 
 * @author  James Corino, Nicholas Gati
 * @version 11/15/21
 */
public class Main
{
  /**
   * Use main to write code to test your functions.  An example
   * is shown for testing the function getMonthName.
   */
  public static void main(String[] args)
  { 
     System.out.println("Month 3 is " + getMonthName(3));
     System.out.println("Month 99 is " + getMonthName(8));
     System.out.println("is leap year " + isLeapYear(400));
     System.out.println("Get Ordinal Mumber " + getOrdinalNum(21));
     System.out.println("get European format " + getUSFormat(12, 3, 2014));
     System.out.println("getOrdinalMonthDay  " + getOrdinalMonthDay(12, 3));
     System.out.println(isValidDate("12/22/2021"));

     formatDate();
     
  }

  /**
   * This function returns the name of the month corresponding
   * to the number.  E.g., if the input is 3, this function
   * returns "March". 
   * 
   * @param month  A valid month 
   *
   * @return The name of the month
   */
  
  public static String getMonthName(int month)
  {
    String nameOfMonth = "" ;
     if (month == 1) {
        nameOfMonth = "January";
     }
     else if (month == 2) {
        nameOfMonth = "February";
     }
     else if (month == 3) {
        nameOfMonth = "March";
     }  
     else if (month == 4) {
        nameOfMonth = "April";
     }
     else if (month == 5) {
        nameOfMonth = "may";
     }
     else if (month == 6) {
        nameOfMonth = "June";
     }
     else if (month == 7) {
        nameOfMonth = "July";
     }
     else if (month == 8) {
        nameOfMonth = "August";
     }
     else if (month == 9) {
        nameOfMonth = "September";
     }
     else if (month == 10) {
        nameOfMonth = "October";
     }
     else if (month == 11) {
         nameOfMonth = "November";
     }
     else if (month == 12) {
        nameOfMonth = "December";
     }
     else {
        nameOfMonth = "the empty string.";
     }
    return nameOfMonth;
  }

//GetOrdinalNum function

  public static String getOrdinalNum(int day)
  {
    if (day == 1 || day == 21 || day == 31) {
      return day + "st";
    }
    else if (day == 2 || day == 22) {
      return day + "nd";
    }
    else if (day == 3 || day == 23) {
      return day + "rd";
    }
    else {
      return day + "th";
    }

 }

//isLeapYear function

 public static boolean isLeapYear(int year)
 {
   if (year % 4 == 0) {
     return true;
   }
   else if (year % 100 == 0) {
     return false;
   }
   else if (year % 400 == 0) {
     return true;
   }
   else {
     return false;
   }
 }
  /**
   * This function prompts the user to enter a date as mm/dd/yyyy.
   * If the date is valid, the user will be allowed to select a 
   * formatting preference for the date (American, European, ISO,
   * Ordinal).  Then, it will output the date in the 
   * requested format.
   */
  public static void formatDate( )
  { 
    String answer = "";
    int month;
    int day;
    int year;
    
   //  mm/dd/yyyy 

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the date you would like to format (mm/dd/yyyy):  ");
    answer = sc.nextLine();
    if (isValidDate(answer))
    {     
      month = Integer.parseInt(answer.substring(0, 2));
      day= Integer.parseInt(answer.substring(3, 5));
      year = Integer.parseInt(answer.substring(answer.length() -4));
      System.out.println("\nEnter the number of the date format you would like.");
      System.out.println("1. American");
      System.out.println("2. European");
      System.out.println("3. ISO");
      System.out.println("4. Ordinal\n");
      
      int orChoice = sc.nextInt();
      System.out.print("\n");
      if (orChoice == 1) {
        System.out.println(getUSFormat(month, day, year));
      }
      else if (orChoice == 2) {
        System.out.println(getEuropeanFormat(month, day, year));
      }
      else if (orChoice == 3){
        System.out.println(getISOFormat(month, day, year));
      }
      else if (orChoice == 4){
        System.out.println(getOrdinalMonthDay(month, day));
      }
      else {
        System.out.println(orChoice + " is not an option"); 
      }
    
    }
    else
    {
      System.out.println("Sorry, " + answer + " is not a valid date in the format mm/dd/yyyy.");
    }
        
    sc.close();
  }

  /**
   * This function returns the date following United States format.
   * 
   * @param month  A valid month.
   * @param day A valid day for the given month.
   * @param year A valid year.
   * 
   * @return The date formatted as nameOfMonth day, year.  E.g., January 25, 2017
   */
  public static String getUSFormat(int month, int day, int year)
  {
    return getMonthName(month) + " " + day + " " + year;
  }

  /**
   * This function returns the date following the most commonly 
   * use European format.
   * 
   * @param month  A valid month.
   * @param day A valid day for the given month.
   * @param year A valid year.
   * 
   * @return The date formatted as day nameOfMonth year. E.g., 25 January 2017
   */
  public static String getEuropeanFormat(int month, int day, int year)
  {
    return day + " " + getMonthName(month) + " " + year;
  }

  /**
   * This function returns the date in International Organization for
   * Standardization (ISO) format.
   * @param month  A valid month.
   * @param day A valid day for the given month.
   * @param year A valid year.
   * 
   * @return The date formatted as year nameOfMonth day. E.g., 2017 January 25
   */
  public static String getISOFormat(int month, int day, int year)
  {
    return year + " " + getMonthName(month) + " " + day;
  }

  /**
   * This function returns the name of the month followed by the
   * ordinal day.
   * 
   * @param month A valid month.
   * @param day A valid day for the given month.
   * 
   * @return the nameOfMonth followed by the ordinal day.  E.g., January 25th
   */
  public static String getOrdinalMonthDay(int month, int day)
  {
    return getMonthName(month) + " " + getOrdinalNum(day);
  }
    
  /**
   * We will say a date is valid if the month is in [1, 12],
   * the year is in [1, 2500], and the day is the correct number
   * of days for the month, including consideration for leap year.
   * Remember the mnemonic rhyme?
   * 
   * Thirty days has September, 
   * April, June, and November.
   * All the rest have 31, 
   * Except for February alone,
   * Which has but twenty-eight days clear,
   * And twenty-nine in each leap year.
   * (https://en.wikipedia.org/wiki/Thirty_days_hath_September)
   * 
   * For our purposes, you may assume the date is in the 
   * format mm/dd/yyyy.
   * 
   * @param date A possible date.
   * @return true If this is a valid date and false otherwise.
   */
  public static boolean isValidDate(String date)
  {
    int month;
    int day;
    int year;
    boolean isValid = true;
        
    if (date.length() == 10)
    {
      try
      {
        month = Integer.parseInt(date.substring(0, 2));
        day = Integer.parseInt(date.substring(3, 5));
        year = Integer.parseInt(date.substring(date.length() -4)); 
        
        if (month <= 12 && day <= 31) {
          if (isLeapYear(year) == false) {
            if (month == 9 || month == 4 || month == 6 || month == 11 || month == 2) 
            {
              if (day <= 30) 
              {
                return isValid;
              }
              else if (month == 2 && day <= 28) 
              {
                return isValid;
              }
              else {
                isValid = false;
              }     
                return isValid;     
            }
          
          }
          else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 || month == 2) {
            if (month == 2 && day <= 29) {
              return isValid;
            }
            else {
            isValid = false;
          }
            return isValid;
      } }
        else {
          isValid = false;
        }
      return isValid; 
      }
      catch(NumberFormatException nfe)  
      {
        isValid = false;
      }
    }
    else {
      isValid = false;   
    }
      return isValid;
  }     
  
  }