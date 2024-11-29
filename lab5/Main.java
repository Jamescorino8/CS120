import java.util.Scanner;
/**
 * Lab 5 Code
 * James Corino 
 * 11/29/21
 */


class Main {
  /**
   * Driver method for testing
   */
   public static void main(String[] args) {
      //printHellos();
      //twoPower();
      //wordSplit();
   }

   public static void printHellos() {

    String hello;
    int numHello;

    Scanner sc = new Scanner(System.in);
    System.out.println("How many times would you like to print Hello? ");
    hello = sc.nextLine();

    int lengthHello = hello.length();

    if (lengthHello == 1) {
      numHello = Integer.parseInt(hello.substring(0, 1));
    }
    else if (lengthHello == 2) {
      numHello = Integer.parseInt(hello.substring(0, 2));
    }
    else {
      numHello = Integer.parseInt(hello.substring(0, 3));
    }

    numHello = numHello - 1; 
    for (int hellos = 0; hellos <= numHello; hellos++)
      System.out.println("Hello");

      sc.close();
   }

   public static void twoPower() {

    String power;
    int n;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a positive value:  ");
    power = sc.nextLine();

    int powLength = power.length();

    if (powLength == 1) {
      n = Integer.parseInt(power.substring(0,1));
    }
    else if (powLength == 2) {
      n = Integer.parseInt(power.substring(0,2));
    }
    else {
      n = Integer.parseInt(power.substring(0,3));
    }

    

    if (n > 0) {
      n = n - 1; 
      for (int twoPow = 0; twoPow <= n; twoPow++)
        System.out.println(Math.pow(2, twoPow));
    }
    
    else {
      System.out.println("This value is not positive");
    }

    sc.close();
   }

  
   public static void wordSplit() {
       
    String word;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word or phrase in all capital letters:  ");
    word = sc.nextLine();

    for(int length = word.length() - 1; length > 0; length -= 0)  {
    word = new StringBuffer(word).insert(length, "-").toString();
    length--;
    }
    
    System.out.println("\n" + word);

    sc.close();
   }
}