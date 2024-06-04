
/**
 * This class contains some methods that need implementing.
 * 
 * @author
 * @version
 */
public class WarmUp {

  /**
   * Given a non-negative number num, return true
   * if num is within 2 of a multiple of 10.
   * 
   * Examples:
   * near10( 15 )  --> false
   * near10( 22 )  --> true
   * near10( 98 )  --> true
   * near10( 83 )  --> false
   * near10( 97 )  --> false
   *
   * @param num a non-negative number
   * @return true if num is within 2 of a multiple of 10.
   */
  public static boolean near10(int num) {

    boolean mulTen = false;
    if (num % 2 == 0) {
      mulTen = true;
    }
    else {
      mulTen = false;
    }
    
    return mulTen;
  }

  /**
   * Given a string str, this method returns a new
   * String that is twice as long and has each letter
   * duplicated.  
   * 
   * Examples:
   * repeat("hello") ---> "hheelllloo"
   * repeat("ox") ---> ooxx
   *
   * @param str a string 
   * @return a new String with each letter of str 
   *         repeated twice
   */
  public static String repeat(String str) {
    
    char[] str1 = str.toCharArray();
    char[] str2 = new char[str.length() * 2];

    for (int i = 0; i < str2.length; i++) {
      
        for (int j = 0; j < 2; j++) {
          str2[i] = str1[i];
        }
      
    }
    String result = str2.toString();
    return result;
  }
}
