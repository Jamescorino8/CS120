public class ArrayUtilities {
      
  public static void printArray(String[] arr) {
    String printE = " ";
    
    for (int i = 0; i < arr.length; i++) {
      printE += arr[i] + " ";
    }
  }
  public static void clear(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 0;
    }  
  }
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }  
  }
  public static int[] getIntArray(int n){    
    int[] arr = { };
    if (n > 0){
     arr = new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = 0;
      }
    }
    return arr;
  }
  public static int getMaxInt(int[]arr){
    int testMax = arr[0];
    
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > testMax){
        testMax = arr[i];
      }
    }

    return testMax;
  }
  
  public static String[] getSortedOf3(String[]arr){ // sort 
    String temp = " ";
    if(arr.length == 3){
      for(int i = 0; i < arr.length; i++){
        for(int j = i + 1; j < arr.length; j++){
          if(arr[i].compareToIgnoreCase(arr[j]) > 0){
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
         }
        }
      }
    }
    for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " ");
    }
    return arr;
  }
  
  public static int[] rotateLeft(int[] arr) {
    int[] aRay = new int[arr.length];
    int length = arr.length - 1;
    aRay[length] = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
      aRay[i] = arr[i + 1];
    }
    
    return aRay;
  }
  public static int[] combine(int[] arr, int[] arr2) {

    int[] combArr = new int[arr.length + arr2.length];
    int count = 0;
    for (int i = 0; i < (combArr.length - arr2.length); i++) {
      combArr[count] = arr[i];
      count++;
    }
    for (int i = 0; i < (combArr.length - arr.length); i++) {
      combArr[count] = arr2[i];
      count++;
    }
    
    return combArr;
  }
  
}