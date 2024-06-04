/**
 * This class represents a stack of boxes that
 * has a number of rows (the height) and a
 * number of columns (the width). Each
 * (row, col) location in the stack is a
 * place where a box could be stored.
 * 
 * @author
 * @version
 */
public class StackOfBoxes {
  private Box[][] boxStack;
  
  /**
   * Construct an empty stack of boxes of an
   * input height and width.
   * 
   * Precondition: height > 0; width >0
   * 
   * @param height The height of the stack
   *               of boxes.
   * @param width  The width of the stack
   *               of boxes.
   */
  public StackOfBoxes(int height, int width) {
    
    boxStack = new Box[height][width];
  }

  /**
   * Add a box to the stack in a certain
   * row and column if there is not a box
   * there already. Return true if the
   * box is added and false otherwise.
   * 
   * @param box The box to be added to the stack.
   * @param row The row in which the box should
   *            be stored.
   * @param col The column in which the box should
   *            be stored.
   * @return True if the box is stored at the row,
   *         col and false otherwise.
   */
  public boolean addBox(Box box, int row, int col) {

    boolean isStored = false;

    if (boxStack[row][col] == null) {
      isStored = true;
      //boxStack[row][col] = box;
    }
    
    return isStored;
  }

  /**
   * Add a box to the stack in the first available
   * location. Return true if the
   * box is added and false otherwise.
   * 
   * @param box The box to be added to the stack.
   * @return True if the box is stored at the row,
   *         col and false otherwise.
   */
  public boolean addBox(Box box) {

    int col = 0;

    boolean isAdded = false;

    for (int row = 0; row < boxStack[row].length; row++) {

      while (boxStack[row][col] != null) {
        col++;
      }

      if (boxStack[row][col] == null) {
        isAdded = true;
      }
    }
   

    return isAdded;
  }

  /**
   * Remove and return the first box in the stack
   * that has the input box size.
   * Return null if no such box exists.
   * 
   * @param boxSize The required box size.
   * @return The box with the input box size
   *         or null if no such box exists.
   */
  public Box removeBox(int boxSize) {
    Box[][] boxStack2 = boxStack;
  

    
    for (int row = 0; row < boxStack.length; row++) {
      for (int col = 0; col < boxStack[row].length; col++) {
        
        
      }
      
    }

  
    return null;

  }

  /**
   * Returns true if the stack is full and false otherwise.
   * 
   * @return True if the stack if full and false otherwise.
   */
  public boolean isFull() {
    boolean isFull = false;

    for (int row = 0; row < boxStack.length; row++) {
      for (int col = 0; col < boxStack[row].length; col++) {

        if (boxStack[row][col] == null) {
          isFull = false;
        }
      }
    }




    return isFull;
  }

  /**
   * Return true if the stack is empty and false otherwise.
   * 
   * @return True if the stack is empty and false otherwise.
   */
  public boolean isEmpty() {
    
    boolean isEmpty = true;

    for (int row = 0; row < boxStack.length; row++) {
      for (int col = 0; col < boxStack[row].length; col++) {

        if (boxStack[row][col] != null) {
          isEmpty = false;
        }
      }
    }
    
    return isEmpty;
    
  }

  /**
   * Returns the location of the first row in the stack
   * where every space in the row has a box. If no such row
   * exists, returns -1.
   * 
   * @return The location of the first row in the stack where
   *         every space in the row has a box. If no such row
   *         exists, returns -1.
   */
  public int getFullRowNumber() {

    int fullRow = -1;
    int count = 0;
   /* 
    for (int row = 0; row < boxStack.length; row++) {
      count = 0;
      for (int col = 0; col < boxStack[0].length; col++) {
        if (boxStack[row][col] != null) {
          count++;
          if (count == boxStack[0].length) {
            
            return row;
          }
          
        }
        else if (count != boxStack[0].length && row == boxStack.length) {
          return -1;
        }
        
      }
    }
*/
    int col = 0;
    int row = 0;
    
    while (count != boxStack[0].length || row > boxStack.length) {
      if (boxStack[row][col] != null) {
        count++;
        col++;
      }
      else if (boxStack[row][col] == null) {
        count = 0;
        row++;
      }
    }
    return fullRow;
  }

  /**
   * Returns the location of the first column in the
   * stack where every space in the column has a box.
   * If no such column exists, returns -1.
   * 
   * For this method, you may assume every row has the
   * same number of columns.
   * 
   * @return The location of the first column in the stack
   *         where every space in the column has a box. If no such
   *         column exists, returns -1.
   */
  public int getFullColumnNumber() {
    
    int fullCol = -1;
    int count = 0;
  
    for (int row = 0; row < boxStack.length; row++) {
      count = 0;
      for (int col = 0; col < boxStack[0].length; col++) {
        
        
      }
    }

    return fullCol;    
   
  }
}
