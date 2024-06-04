class Main {
  public static void main(String[] args) {
    //testBox();
    testStackOfBoxes();
  }

  public static void testBox() {
    int score = 0;
    int maxScore = 0;

    // Construct a box with a correct input capacity
    Box box1 = new Box(24);
    if (box1.getBoxSize() == 24)
      score++;
    if (box1.getNumInBox() == 0)
      score++;
    System.out.println("Should print a box of size 24 with 0 bottles.");
    System.out.println(box1.toString());
    System.out.println();
    maxScore += 2;

    // Add 8 bottles of the default size
    if (box1.addBottles(8))
      score++;
    if (box1.getNumInBox() == 8)
      score++;
    if (box1.countBottlesOf(Bottle.DEFAULT_CAPACITY + 1) == 0)
      score++;
    if (box1.countBottlesOf(Bottle.DEFAULT_CAPACITY) == 8)
      score++;
    System.out.println("Should print a box of size 24 with 8 bottles of size " +
        Bottle.DEFAULT_CAPACITY + ":");
    System.out.println(box1.toString());
    System.out.println();
    maxScore += 4;

    // Add 16 bottles that have an 8oz capacity
    if (box1.addBottles(16, 8))
      score++;
    if (box1.countBottlesOf(8) == 16)
      score++;
    if (box1.getNumInBox() == 24)
      score++;
    System.out.println("Should print a box of size 24 with 24 bottles, 8 of size " +
        Bottle.DEFAULT_CAPACITY + " and 16 bottles of size 8:");
    System.out.println(box1.toString());
    System.out.println();
    maxScore += 3;

    // Attempt to add another bottle - should fail
    if (!box1.addBottles(1))
      score++;
    if (!box1.addBottles(1, 8))
      score++;
    maxScore += 2;

    // Remove 32oz bottles - should return an array of length 0
    if (box1.removeBottles(32).length == 0)
      score++;
    maxScore++;

    // Remove all 8 bottles of the default size - should return an array of length 8
    Bottle[] removed = box1.removeBottles(Bottle.DEFAULT_CAPACITY);
    if (removed.length == 8)
      score++;
    for (Bottle b : removed) {
      if (b.getCapacity() == Bottle.DEFAULT_CAPACITY) {
        score++;
      }
    }
    maxScore += 9;

    // Remove all 16 bottles 8oz size - should return an array of length 16
    removed = box1.removeBottles(8);
    if (removed.length == 16)
      score++;
    maxScore++;

    // Attempt to remove bottles on an empty array
    removed = box1.removeBottles(8);
    if (removed.length == 0)
      score++;
    maxScore++;

    // Construct a box with an incorrect input capacity
    box1 = new Box(0);
    if (box1.getBoxSize() == 12)
      score++;
    if (box1.getNumInBox() == 0)
      score++;
    maxScore += 2;

    // Attempt to add an invalid number of bottles - should fail
    if (!box1.addBottles(-1))
      score++;
    if (!box1.addBottles(13))
      score++;
    if (!box1.addBottles(-1, 12))
      score++;
    if (!box1.addBottles(13, 12))
      score++;
    maxScore += 4;

    box1 = new Box(Bottle.DEFAULT_CAPACITY + 1);
    if (box1.getBoxSize() == 12)
      score++;
    if (box1.getNumInBox() == 0)
      score++;
    maxScore += 2;

    System.out.println("Score:  " + score);
    System.out.println("MaxScore:  " + maxScore);
  }

  public static void testStackOfBoxes() {
    int score = 0;
    int maxScore = 0;
    final int ROWS = 4;
    final int COLS = 3;

    StackOfBoxes stack = new StackOfBoxes(ROWS, COLS);
    if (!stack.isFull())
      score++;
    
    if (stack.isEmpty())
      score++;
    
    if (stack.getFullRowNumber() == -1)
      score++;
   
    if (stack.getFullColumnNumber() == -1)
      score++;
    
    maxScore += 4;
   
    // add a full row plus one more box - fills
    // row 0 and stack[1][0].
    for (int i = 0; i < COLS + 1; i++) {
      if (stack.addBox(new Box(12)))
        score++;
    }
  
    if (!stack.isFull())
      score++;

    if (!stack.isEmpty())
      score++;

    if (stack.getFullRowNumber() == 0)
      score++;

    if (stack.getFullColumnNumber() == -1)
      score++;
    maxScore += COLS + 5;
    System.out.println(score + " " + maxScore);
    if (stack.removeBox(24) == null)
      score++;
    System.out.println(score + " " + maxScore);
    if (stack.removeBox(12) != null)
      score++;
    System.out.println(score + " " + maxScore);
    if (stack.getFullRowNumber() == -1)
      score++;
    maxScore += 3;
    System.out.println(score + " " + maxScore);
    // remove the remaining boxes in the stack
    for (int i = 0; i < COLS; i++) {
      if (stack.removeBox(12) != null)
        score++;
    }
    System.out.println(score + " " + maxScore);
    if (stack.isEmpty())
      score++;
    maxScore += COLS + 1;
    System.out.println(score + " " + maxScore);
    // fill row 1
    for (int i = 0; i < COLS; i++) {
      if (stack.addBox(new Box(12), 1, i))
        score++;
    }
    maxScore += COLS;
    System.out.println(score + " " + maxScore);
    // fill col 2 (row 1, col 2 already has a box)
    for (int i = 0; i < ROWS; i++) {
      boolean result = stack.addBox(new Box(12), i, 2);
      if (result || i == 2)
        score++;
    }
    maxScore += ROWS - 1;
    System.out.println(score + " " + maxScore);
    if (stack.getFullRowNumber() == 1)
      score++;
    if (stack.getFullColumnNumber() == 2)
      score++;
    if (!stack.isFull())
      score++;
    if (!stack.isEmpty())
      score++;
    maxScore += 4;
    System.out.println(score + " " + maxScore);
    // Remove all of the boxes
    for (int i = 0; i < ROWS + COLS - 1; i++) {
      if (stack.removeBox(12) != null)
        score++;
    }
    if (stack.isEmpty())
      score++;
    maxScore += ROWS + COLS;
    System.out.println(score + " " + maxScore);
    // Fill the stack
    for (int row = 0; row < ROWS; row++) {
      for (int col = 0; col < COLS; col++) {
        if (stack.addBox(new Box(12)))
          score++;
      }
    }
    if (stack.isFull())
      score++;
    if (stack.getFullRowNumber() == 0)
      score++;
    if (stack.getFullColumnNumber() == 0)
      score++;
    maxScore += ROWS * COLS + 3;
    System.out.println(score + " " + maxScore);
    // Try to add one more box - should fail
    if (!stack.addBox(new Box(12)))
      score++;
    maxScore++;
    System.out.println(score + " " + maxScore);
    System.out.println("Your score:  " + score + "/" + maxScore);
    if (score == maxScore) {
      System.out.println("Congratulations!");
    } else {
      System.out.println("Keep going.  You can do it!");
    }
  }
}