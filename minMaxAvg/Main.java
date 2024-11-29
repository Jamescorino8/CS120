import java.util.Random;
class Main {
  public static void main(String[] args){
    int counter = 0; 
    int average = 0;
    int num;
    int min = 200;
    int max = 100;
    int averageCounter = 0;
 
     
    Random r = new Random();
    
    while (counter < 100){
      num = r.nextInt(100) + 100;
      
      if (num % 5 == 0){
        average += num;
        averageCounter++;
        if (num > max)
        {
          max = num;
        }
        else if (num < min)
        {
          min = num;
        }
    
      }
      counter++;  
    }
    System.out.println("Min:  " + min + "\nMax: " + max + "\nAverage: " + (average / averageCounter));
  }
}