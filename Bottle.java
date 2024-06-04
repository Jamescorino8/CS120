/**
 * DO NOT EDIT THIS CLASS!!!
 * 
 * This class models a bottle of water. A bottle will have a capacity
 * and a measure of contents, both in fluid ounces. A bottle's contents
 * cannot exceed its capacity.
 * 
 * @author Prof. White
 * @version Spring 2021
 */
public class Bottle {
  // The default size of a bottle.
  public static int DEFAULT_CAPACITY = 64;

  // The amount the bottle can hold in fluid ounces.
  private int capacity;

  // The amount of liquid in the bottle in fluid ounces.
  private int contents;

  /**
   * Constructs a Bottle object of the default size and
   * no contents.
   */
  public Bottle() {
    capacity = DEFAULT_CAPACITY;
    contents = 0;
  }

  /**
   * Constructs a Bottle object of the input capacity
   * and contents. If the capacity is less than or
   * equal to zero, the contents is less than zero,
   * or the contents exceeds the capacity, constructs
   * a Bottle object of the default size and
   * no contents.
   * 
   * @param capacity The amount the bottle can hold in
   *                 fluid ounces.
   * @param contents The amount of fluid in the bottle
   *                 in fluid ounces.
   */
  public Bottle(int capacity, int contents) {
    if (capacity <= 0 || contents < 0 || contents > capacity) {
      this.capacity = DEFAULT_CAPACITY;
      this.contents = 0;
    } else {
      this.capacity = capacity;
      this.contents = contents;
    }
  }

  /**
   * Returns the capacity of the bottle.
   * 
   * @return The capacity of the bottle.
   */
  public int getCapacity() {
    return capacity;
  }

  /**
   * Returns the contents of the bottle.
   * 
   * @return The contents of the bottle.
   */
  public int getContents() {
    return contents;
  }

  /**
   * Changes the contents of the bottle to the input value if
   * the input value is greater than or equal to 0 and less
   * then or equal to the capacity of the bottle.
   * 
   * @param newContents The value to set the contents of the
   *                    bottle to in [0, capacity of bottle].
   */
  public void setContents(int newContents) {
    if (newContents >= 0 && newContents <= capacity) {
      contents = newContents;
    }
  }

  /**
   * Returns a description of the bottle's capacity and
   * contents.
   * 
   * @return A description of the bottle's capacity and
   *         contents.
   */
  @Override
  public String toString() {
    return "This bottle has " + contents + "oz in a " +
        capacity + "oz container.";
  }
}
