import java.lang.Math;

class Main {
  public static void main(String[] args) {

    // test case for Question 8
    int[] q8 = {2, 3, 8, 8, 2, 4, 2, 9, 11};
    int r8 = lastIndexOf(q8, 2);
    // correct answer should be r8 = 6
    System.out.println("lastIndexOf({2, 3, 8, 8, 2, 4, 2, 9, 11},2) correct response is 6 ");
    System.out.println("lastIndexOf({2, 3, 8, 8, 2, 4, 2, 9, 11},2) returned " + r8);
    System.out.println();
    // create your own test cases for the 
    // other questions!
//RANGE
    int testRange = range(q8);
    System.out.println("range({2, 3, 8, 8, 2, 4, 2, 9, 11}) correct response is 9 ");
    System.out.println("range({2, 3, 8, 8, 2, 4, 2, 9, 11}) returned " + testRange);

    System.out.println();

    double[] q9 = {2, 3, 8, 8, 2, 4, 2, 9, 11};//DOUBLE ARRAY
//ISSORTED
    boolean testSorted = isSorted(q9);
    System.out.println("isSorted({2, 3, 8, 8, 2, 4, 2, 9, 11}) correct response is false ");
    System.out.println("isSorted({2, 3, 8, 8, 2, 4, 2, 9, 11}) returned " + testSorted);

    System.out.println();
//MODE
    int testMode = mode(q8);
    System.out.println("mode({2, 3, 8, 8, 2, 4, 2, 9, 11}) correct response is 2 ");
    System.out.println("mode({2, 3, 8, 8, 2, 4, 2, 9, 11}) returned " + testMode);

    System.out.println();
//MODEANY
    int testModeAny = modeAny(q8);
    System.out.println("modeAny({2, 3, 8, 8, 2, 4, 2, 9, 11}) correct response is  ");
    System.out.println("modeAny({2, 3, 8, 8, 2, 4, 2, 9, 11}) returned " + testModeAny);

    System.out.println();
//MIN
    int testMin = min(q8);
    System.out.println("min({2, 3, 8, 8, 2, 4, 2, 9, 11}) correct response is 2 ");
    System.out.println("min({2, 3, 8, 8, 2, 4, 2, 9, 11}) returned " + testMin);

    System.out.println();
//STDEV
    int[] q10 = {85,69,98,85,94,72,98,92,95,81,69,90,88,62,91,55,53,60,66,71,54,74,57};
    double testStDev = stdev(q10);
    System.out.println("stdev({85,69,98,85,94,72,98,92,95,81,69,90,88,62,91,55,53,60,66,71,54,74,57}) correct response is 14.986572439926498 ");
    System.out.println("stdev({85,69,98,85,94,72,98,92,95,81,69,90,88,62,91,55,53,60,66,71,54,74,57}) returned " + testStDev);

    System.out.println();
//AVERAGE
    double testAverage = average(q8);
    System.out.println("Average({2, 3, 8, 8, 2, 4, 2, 9, 11}) correct response is 5.428571428571429 ");
    System.out.println("Average({2, 3, 8, 8, 2, 4, 2, 9, 11}) returned " + testAverage);
    
  }

    /*
     * Question 8
     * Write a method called lastIndexOf that 
     * accepts an array of integers and an integer
     * value as its parameters and returns the 
     * last index at which the value occurs in 
     * the array.  The method should return -1 if 
     * the value is not found.  For example, in the array 
     * 
     * {74, 85, 102, 99, 101, 85, 56} 
     * 
     * the last index of the value 85 is 5. 
     */
    public static int lastIndexOf(int[] arr, int val)
    {
      int indexOf = 0;
      
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] != val) {
          indexOf++;
        }
      }
      
      return indexOf;
    }

    /*
     * Question 9
     * Write a method called range that returns the range of values in an array 
     * of integers.  The range is defined as 1 more than the difference 
     * between the maximum and minimum values in the array.  For example, 
     * if an array called list contains the values 
     * 
     * {36, 12, 25, 19, 46, 31, 22}
     * 
     * the call of range(list) should return 35 (46 – 12 + 1).  
     * 
     * You may assume the array has at least one element. (p. 511, #2)
     */
    public static int range(int[] arr)
    {
      int largest = 0, smallest = 100;
      
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
          largest = arr[i];
        }
        if (arr[i] < smallest) {
          smallest = arr[i];
        }
      }
      int theRange = largest - smallest;
      return theRange;
    }

    /*
     * Question 10
     * Write a method called isSorted that accepts an array of real numbers 
     * as a parameter and returns true if the list is in sorted (increasing) 
     * order and false otherwise. For example, if arrays named list1 and list2 store 
     * 
     * {16.1, 12.3, 22.2, 14.4} and {1.5, 4.3, 7.0, 19.5, 25.1, 46.2} 
     * 
     * respectively, the calls isSorted(list1) and isSorted(list2) should 
     * return false and true respectively.  
     * 
     * Assume the array has at least one element.  A one-element array is 
     * considered to be sorted.  (p. 511 #4)
     */
    public static boolean isSorted(double[] arr)
    {
      boolean isSorted = false;
      
      for (int i = 0; i > arr.length - 1; i++) {
        if (arr[i] < arr[i + 1]) {
          isSorted = true;
        }
        else if (arr[i] > arr[i + 1]){
          isSorted = false;
        }
      }
      
      return isSorted;
    }

    /*
     * Question 11
     * Write a method called mode that returns the most frequently occurring 
     * element of an array of integers.  Assume that the array has at least one 
     * element and that every element in the array has a value between 0 and 100 
     * inclusive.  Break ties by choosing the lower value.  For example, if the 
     * array passed contains the values {27, 15, 15, 11, 27}, your method should 
     * return 15. (p. 511, #5)
     */
    public static int mode(int[] arr)
    {
      int highValue = 1;
      int x = 0;
      int arrValue = arr[0];
      int nextValue = 0;
      int compValue = 0;
      for(int i = 0; i < arr.length; i++){
        compValue = arr[i];
        for(int j = i +1; j < arr.length; j++){
          nextValue = arr[j];
          if (compValue == nextValue){
            x += 1;
          }
        }
        if(x > highValue){
          highValue = x;
          arrValue = compValue;
        }
        x = 0;
      }
      return arrValue;
    }

    /*
     * Question 12
     * Rewrite the mode method to work for any range of integers.
     */
    public static int modeAny(int[] arr)
    {
      int highValue = 1;
      int x = 0;
      int arrValue = arr[0];
      int nextValue = 0;
      int compValue = 0;
      for(int i = 0; i < arr.length; i++){
        compValue = arr[i];
        for(int j = i +1; j < arr.length; j++){
          nextValue = arr[j];
          if (compValue == nextValue){
            x += 1;
          }
        }
        if(x > highValue){
          highValue = x;
          arrValue = compValue;
        }
        x = 0;
      }
      return arrValue;
    }

    /*
     * Helper method.
     * Returns the smalles value in the array.
     */
    private static int min(int[] arr)
    {
      int smallValue = arr[0];
      
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < smallValue) {
          smallValue = arr[i];  
        }
      }
      
      return smallValue;
    }

    /*
     * Question 13    
     * Write a method called stdev that returns the standard deviation of an 
     * array of integers.  Standard deviation is computed by taking the square 
     * root of the sum of the squares of the differences between each element 
     * and the mean, divided by one less than the number of elements.  
     * (It’s just that simple!)  
     * 
     * Formula image:  
     * https://bit.ly/2RjqNvn
     * 
     * E.g., According the Excel, 
     * STDEV(85,69,98,85,94,72,98,92,95,81,69,90,88,62,91,55,53,60,66,71,54,74,57)
     * is 14.986572439926.
     */
    public static double stdev(int[] arr)
    {
      double sum = 0.0, standardDeviation = 0.0;
      int length = arr.length;

      for(double num : arr) {
        sum += num;
      }

      double mean = sum/length;

      for(double num: arr) {
        standardDeviation += Math.pow(num - mean, 2);
      }

      return Math.sqrt(standardDeviation/length);
    }

    /*
     * Helper function.
     * Returns the average of the values in the array.
     */
    private static double average(int[] arr)
    {
      double average = 0;
      double j = 0;

      for (int i = 0; i < arr.length - 1; i++) {
        average += arr[i];
        j = i;
      }
      average = average / j;
      return average;
    }
}