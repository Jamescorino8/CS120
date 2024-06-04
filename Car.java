/**
 * The Car class.
 * 
 * A car has the attributes year (e.g., 2021),
 * make (e.g., Ford), and speed (e.g., 20.5).
 * 
 * Appropriate accessor methods should be provided
 * for each.
 * 
 * When a car is created, the make and year is
 * provided as input and the car's speed is 0.0.
 * 
 * The car has the behavior accelerate that takes
 * as input the amount the car accelerates. The
 * resulting speed of the car is a maximum
 * value of 95.0.
 * 
 * The car has the behavior decelerate that takes
 * as input the amount the car decelerates. The
 * resulting speed of the car is a minimum value
 * of 0.0.
 * 
 * The string description of the state of the car
 * is year make: speed E.g., 2021 Ford: 0.0
 *
 * @author James Corino  
 * @version 5/16/22
 */
public class Car {
  
  private int year;
  private String make;
  private double speed;
  
  public Car(String make1, int year1) {
    
  year = year1;
  make = make1;
  speed = 0.0;

  }
  
  public int getYear() {
    
    return year;
  }
  
  public String getMake() {
    
    return make;
  }
  public double getSpeed() {
    
    return speed;
  }
  
  public String toString() {
    
    return (year + " " + make + ":");
  }

  public void accelerate(int ammount) {

    if ((speed + ammount) > 95.0) {
      speed = 95.0;
    }
    else {
      speed = speed + ammount;
    }
    
  }
  
  public void decelerate(int ammount) {

    if (speed - ammount < 0.0) {
      speed = 0.0;
    }
    else {
      speed = speed - ammount;
    }
  }
}
