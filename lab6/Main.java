import java.util.Scanner;
import java.util.Random;

/**
 * Lab 6
 * James Corino, Nicholas Gati
 * 12/21/2021
 */

class Main {
  public static void main(String[] args) {
    
    //terminalShapes();
    lab6Part3();
    //printRectangle(5, 10);
    //printTriangle(5);
    
    //flipACoin();
    gradeBook();
    
  }

  public static void terminalShapes() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter a Size:");
    int size = sc.nextInt();
    printRectangle(size, size * 2);
    printTriangle(size);
    printPyramid(size);
  }

  public static void printRectangle(int height, int width) {
  // size rows(up and down) and 2 * size columns (left and right)
    
    for (int j = 0; j < height; j++){
      System.out.print("\n");
      for (int i = 0; i < width; i++)
        System.out.print("*");
    }
    System.out.println("\n");
  }

  public static void printTriangle(int size) {
    //size = 5
    int triangleBase = size;
    
    for (int i = 0; i < size; i++){
      for (int j = 0; j < i + 1; j++){
        System.out.print("*");
      }
     System.out.println("");
    }
    
    System.out.println("\n");
  }

public static void printPyramid(int height){

  for (int i = 0; i < height; i++) {
    for (int j = 0; j < height - i; j++) {
      System.out.print(" ");
    }
    for (int k = 0; k <= i; k++) {
      System.out.print("*");
    }
    for (int l = 0; l <= i - 1;l++){
      System.out.print("*");
      }
    System.out.println("");
  }
}
  /**
     * This program will continually read 
     * in names from the keyboard, and then 
     * respond with the output 
     * 
     * HELLO, <input name>. 
     * 
     * where <input name> is the input.
     * The program will stop if the input is 
     * the word STOP.
     */
    public static void lab6Part3()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please type in a name:  ");
        String nameInput = keyboard.nextLine();
                
        // uncomment the while loop below!
        
        while(nameInput.equals("STOP") != true)
        {
          System.out.println("Hello, " + nameInput + ".");
          System.out.print("Please type in a name:  ");
          nameInput = keyboard.nextLine();
        }
    }

    //PART 2

    public static void flipACoin()
    {
      int counter = 0;
      int num;
      Random coin = new Random();

      while (counter < 10){
        num = coin.nextInt(2);
        if (num == 1) {
          System.out.println("Heads");
        }
        else {
          System.out.println("Tails");
        }
        counter++;
      }
    }

  public static void gradeBook() 
  {
    for(;;) {

    int numGrade = 0; //number of grades
    int grades = 0;
    int counter = 0;
    int grade = 0; //adds for average
    String name = " ";

    Scanner input = new Scanner(System.in);

    do {
      System.out.print("Enter the user data:  ");
      name = input.next();
      numGrade = input.nextInt();
    } while (name.equals("STOP") && (numGrade == 0));

    while (counter < numGrade) {
    grades = input.nextInt();   //grades
    grade += grades;
    counter++;
    }
    
    System.out.println("The average for " + name + " is " + (grade / numGrade));

    }
  }  
}


