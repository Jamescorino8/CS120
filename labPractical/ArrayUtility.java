/**
 * This class implements methods that manipulate
 * 1-dimensional arrays.
 * 
 * @author James Corino  
 * @version 5/16/22
 */
public class ArrayUtility {
  /**
   * This method returns the sum of the values in the input
   * array except if the value is divisible by the input
   * factor. E.g., if the input array is {3, 5, 8, 10} and
   * the input factor is 5, the method returns 11, which is
   * the sum of 3 and 8. Since 5 and 10 are both divisible
   * by 5, they are not included in the sum.
   * 
   * Precondition: The array is at least length one.
   * 
   * @param orig   The input array whose values are summed.
   * @param factor If an array value is divisible by factor,
   *               it is not included in the sum.
   * @return The sum of the values in the input array
   *         except if the value is divisible by the input factor.
   */
  public static int sumExcept(int[] orig, int factor) {

    int sum = 0;

    for (int i = 0; i < orig.length; i++) {
      if (orig[i] % factor != 0) {
        sum += orig[i];
      }
    }
    
    return sum;
  }

  /**
   * This method returns a copy of the values in the original
   * array in [from, to].
   * 
   * Precondition: from is in [0, orig.length - 1]
   * Precondition: to is in [from + 1, orig.length - 1]
   * 
   * E.g., if orig = {0, 1, 2, 3, 4, 5, 6} and the method
   * call copyOfRange(orig, 2, 4) is made, the array
   * {2, 3, 4} is returned.
   * 
   * @param orig The original array to be copied in the
   *             range [from, to].
   * @param from The first index to copy.
   * @param to   The last index to copy
   * @return A copy of the values in the original array in
   *         [from, to].
   */
  public static int[] copyOfRange(int[] orig, int from, int to) {

    int lengthFrom = 0;
    int lengthTo = 0;
    
    for (int i = 0; orig[i] != from; i++) {
      lengthFrom++;
    }
    for (int i = lengthFrom; orig[i] != to; i++) {
      lengthTo++;
    }

    int[] copy = new int[lengthTo + 1];

    int count = lengthFrom;
    
    for (int i = 0; i < copy.length; i++) {
      copy[i] = orig[count];
      count++;
    }

    return copy;
  }

  /**
   * This method takes as input two one dimensional arrays and
   * returns a single array that contains all combinations of the
   * values in the first array concatenated with the values in
   * the second array. E.g., if first = {"A", "B", "C"} and
   * second = {"Y, "Z"}, the array that is returned contains
   * {"AY", "AZ", "BY, "BZ", "CY", "CZ"}.
   * 
   * @param first  The first input array.
   * @param second The second input array.
   * @return A single array of all combinations of the values in
   *         the first array concatenated with values in the second array.
   */
  public static String[] combinations(String[] first, String[] second) {

    String[] comb = new String[first.length * second.length]; 
    
    int count1 = 0;
    int count2 = 0;

    
    for (int i = 0; i < first.length; i++) {
      count2 = 0;

      for (int k = 0; k < second.length; k++) {
        comb[count1] = first[i] + second[count2];
          count2++;
          count1++;
      }
      
    }

    return comb;
  }
}
