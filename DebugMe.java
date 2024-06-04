import java.util.ArrayList;
import java.util.Scanner;

/**
 * Lab 8, Debugging Exercise
 *
 * @author james corino nichoals gati
 * @version 4/4/2022
 */
public class DebugMe
{
    //A list of words that should be ignored at input.
    private static ArrayList<String> ignoreTheseWords;

    /**
     * This program prompts the user to enter a list of words.  The
     * user should signal the end of their input by entering the word
     * done in any combination of case (e.gd, Done, done, DONE, etc.).
     * 
     * The program then prints a list of the unique words the user entered,
     * one per line, in reverse order and lowercase.  Except, the program 
     * ignores any word the user entered that is saved in the ArrayList 
     * ignoreTheseWords.
     * 
     * @param  args This program requires no command line input.
     */
    public static void main(String[] args)
    {
      populateIgnoreTheseWords();

        ArrayList<String> keepTheseWords = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a list of words.  To end your input, enter done.");
        String word = keyboard.next();

        while(!word.equalsIgnoreCase("done")){
            if(!ignoreTheseWords.contains(word)){
                if(!keepTheseWords.contains(word)){
                     keepTheseWords.add(0,word);
                }
            }
        }

        System.out.println("\nThe words this program is keeping are:  ");
        for(String kept : keepTheseWords){
          word = word.toLowerCase();
          System.out.println(kept);
          word = keyboard.next();
        }
      keyboard.close();
    }

    /**
     * Adds words to the ignoreTheseWords ArrayList.
     */
    private static void populateIgnoreTheseWords()
    {
        ignoreTheseWords = new ArrayList<String>();
        ignoreTheseWords.add("a");
        ignoreTheseWords.add("and");
        ignoreTheseWords.add("are");
        ignoreTheseWords.add("at");
        ignoreTheseWords.add("int");
        ignoreTheseWords.add("of");
        ignoreTheseWords.add("on");
        ignoreTheseWords.add("or");
        ignoreTheseWords.add("to");
        ignoreTheseWords.add("the");
    }
}