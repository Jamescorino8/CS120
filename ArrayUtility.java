
/**
 * This class implements methods that manipulate
 * 1-dimensional arrays.
 * 
 * @author
 * @version
 */
public class ArrayUtility {
  /**
   * This method adds bonus to each value in the array that
   * is less than 75.
   * E.g., if the input array is {70, 98, 45, 71, 82} and
   * the input bonus is 5, then after this method runs the
   * input array contains {75, 98, 50, 76, 82}.
   * 
   * Precondition: The array is at least length one.
   * 
   * @param grades The input array of grades.
   * @param bonus  Amount of bonus points
   */
  public static void curve(int[] grades, int bonus) {

    int[] bonusGrade = new int[grades.length];

    for (int i = 0; i < grades.length; i++) {
      bonusGrade[i] = (grades[i] + 5);
    }
  }

  /**
   * This method returns a new array containing
   * only the values from the input array that
   * larger than cutoff, in the same order as they
   * appeared in the input array.
   * If no values in the input array are larger than
   * cutoff, then return null.
   * 
   * E.g., if orig = {0, 7, 2, 9, 14, 5, 3, 8} and
   * the method call largerThan(orig, 5) is made, the
   * array {7, 9, 14, 8} is returned.
   *
   * Hint - first count how many values are larger
   * than the cutoff, then create the new array and
   * fill it with the values.
   * 
   * @param orig   an array of values
   * @param cutoff only values larger than cutoff
   *               are returned.
   * @return A new array containing all values from
   *         orig that are larger than cutoff. If no
   *         values are larger, then null is returned.
   */
  public static int[] largerThan(int[] orig, int cutoff) {
    int count = 0;
    for (int i = 0; i < orig.length; i++) {
      if (orig[i] < cutoff) {
        count++;
      }
    }

    int[] larger = new int[count];

    for (int i = 0; i < larger.length; i++) {
      if (orig[i] < cutoff) {
        larger[i] = orig[i];
      }
    }

    return larger;
  }

  /**
   * This method takes as input two one dimensional arrays of Strings and
   * returns a count of how many Strings the two
   * arrays have in common.
   * E.g., if first = {"Bob", "Jill", "Sam", "Abe"}
   * and second = {"Sam, "Mae", "Bob"}, then 2 should
   * be returned because they have "Bob" and "Sam"
   * in common.
   * 
   * @param first  The first input array.
   * @param second The second input array.
   * @return A count of how many Strings the two
   *         arrays have in common.
   */
  public static int numInCommon(String[] first, String[] second) {

    int count = 0;
    int count1 = 0;
    int count2 = 0;
    
    for (int i = 0; i < second.length; i++) {
      if (first[count1] == second[i]) {
        count++;
        count1++;
      } else {
        count1++;
      }
    }
    
    for (int i = 0; i < first.length; i++) {
      if (second[count2] == first[i]) {
        count++;
        count2++;
      } else {
        count2++;
      }
    }

    return count;
  }
}
