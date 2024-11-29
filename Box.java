/**
 * This class represents a box that can hold a certain
 * number of bottles. The bottles can have different
 * capacities.
 * 
 * DO NOT EDIT THIS CLASS EXCEPT AS INDICATED IN THE
 * LAB DIRECTIONS.
 * 
 * @author
 * @version
 */
public class Box {
  // Holds enough space for all of the bottles in the box.
  private Bottle[] bottles;

  // Holds the number of bottles that are in the box.
  private int numInBox;

  /**
   * Constructs a box that can hold the input number
   * of bottles. If the input number is not in [1, 24],
   * then a box that can hold 12 bottles is constructed.
   * After construction, there are no bottles in the box.
   * 
   * @param The number of bottles the box can hold in [1, 24].
   */
  public Box(int numBottles) {
    if (numBottles > 0 && numBottles <= 24) {
      bottles = new Bottle[numBottles];
    } else {
      bottles = new Bottle[12];
    }

    numInBox = 0;

  }

  /**
   * Returns the number of bottles in the box.
   * 
   * @return The number of bottles in the box.
   */
  public int getNumInBox() {
    return numInBox;
  }

  /**
   * Returns the number of bottles the box can hold.
   * 
   * @return The number of bottles the box can hold.
   */
  public int getBoxSize() {
    return bottles.length;
  }

  /**
   * If the number of bottles to add is less than 1,
   * returns false.
   * 
   * Otherwise, if there is enough room in the box, adds the
   * input number of bottles to the box, each bottle
   * having the input capacity and filled with the same
   * number of fluid ounces. Then, returns true.
   * 
   * If there is not enough room in the box, does
   * not add any bottles to the box and returns false.
   * 
   * @param num      The number of bottles to add to the box.
   * @param capacity The number of fluid ounces the bottle
   *                 can hold (and the amount of liquid that
   *                 is in the bottle).
   * @return True if the bottles are added to the box and
   *         false otherwise.
   */
  public boolean addBottles(int num, int capacity) {
    boolean added = false;

    if (num > 0 && numInBox + num <= bottles.length) {
      for (int i = 0; i < num; i++) {
        bottles[numInBox] = new Bottle(capacity, capacity);
        numInBox++;
      }

      added = true;
    }

    return added;
  }

  /**
   * Adds the input number of bottles to the box, each bottle
   * having the default bottle capacity of 64 ounces.
   * 
   * Hint: You can use the addBottles method above to do this!
   * 
   * Bonus if you use the Bottle class's constant for the default
   * capacity of the bottle.
   */
  public boolean addBottles(int num) {
    return addBottles(num, Bottle.DEFAULT_CAPACITY);
  }

  /**
   * Returns the number of bottles in the box that have
   * the same capacity as the input capacity.
   * 
   * @param capacity The capacity of the bottles that
   *                 are being counted.
   * @return The number of bottles in the box that have
   *         the same capacity as the input capacity.
   */
  public int countBottlesOf(int capacity) {
    // EDIT THIS METHOD TO USE AN ENHANCED FOR LOOP INSTEAD OF THE
    // LOOP THAT IS GIVEN.

    int count = 0;

    for (int index = 0; index < bottles.length; index++) {
      if (bottles[index] != null && bottles[index].getCapacity() == capacity) {
        count++;
      }
    }

    return count;
  }

  /**
   * Removes all bottles that have the same capacity as
   * the input capacity from the box and returns an array
   * of the removed bottles.
   * 
   * @param The capacity of the bottles to be removed.
   * @return An array of the removed bottles.
   */
  public Bottle[] removeBottles(int capacity) {
    int numToRemove = countBottlesOf(capacity);
    Bottle[] removed = new Bottle[numToRemove];
    int inBox = 0;

    for (int i = 0; i < bottles.length; i++) {
      if (bottles[i] != null && bottles[i].getCapacity() == capacity) {
        removed[inBox] = bottles[i];
        inBox++;
        bottles[i] = null;
        numInBox--;
      }
    }

    return removed;
  }

  /**
   * Returns a string with the number of bottles the box
   * can hold, followed by the number of bottles in the
   * box, followed by a description of each bottle in the
   * box. When the returned string is printed, the
   * number of bottles the box can hold, the number of bottles
   * in the box, and each bottle is printed on its own line.
   * 
   * @return The string description of each bottle in
   *         the box.
   */
  @Override
  public String toString() {
    // EDIT THIS METHOD TO USE A StringBuffer TO BUILD THE RETURN STRING.

    String description = "Box can hold:  " + bottles.length +
        " bottles\nNumber of bottles:  " +
        numInBox + "\n";

    for (int i = 0; i < bottles.length; i++) {
      if (bottles[i] != null) {
        description += (i + 1) + ". " + bottles[i].toString() + "\n";
      }
    }

    return description;
  }
}
