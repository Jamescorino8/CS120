/**
 * This class contains some methods that need implementing.
 * 
 * @author James Corino
 * @version 5/16/22
 */
public class WarmUp {

  /**
   * Given the input grade g, this method returns true if
   * g is greater than or equal to 90 (an A) or less than
   * 60 (an F). It returns false otherwise.
   * 
   * @param g grade
   * @return true if g is >= 90 or < 60, and false otherwise.
   */
  public static boolean highLowGrade(int g) {
    
    boolean greater = false;
    if (g >= 90 || g < 60) {
      greater = true;
    }
    
    return greater;
  }

  /**
   * Given a postive input value n, this method returns
   * a string of n asterisks. Some examples are below:
   * 
   * if n is 5, it would return the String "*****"
   * if n is 10, it would return the String "*********"
   * 
   * @param n a positive value > 0
   * @return a String of n asterisks
   */
  public static String stars(int n) {
    String asterisks = "";

    for (int i = 0; i < n; i++) {
      asterisks += "*";
    }
    
    return asterisks;
  }
}
