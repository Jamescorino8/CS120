/**
 * The Contestant class.
 * 
 * A contestant has the attributes name (e.g.,
 * "Peggy"), score (e.g., 100), and number of
 * lives left (e.g., 2).
 * 
 * Appropriate accessor methods should be provided
 * for each.
 * 
 * When a Contestant is created, the name is set
 * to the input value, the score is set to 0,
 * and the number of lives is set to 4.
 * 
 * The Contestant has the behavior changeScore that
 * adds an input amount (positive or negative)
 * to the contestant's score. If the score drops
 * below 0, a life is subtracted and the score is set
 * to 0.
 * 
 * The Contestant has the behavior canGetBonusLife
 * that returns true if the contestant's score
 * is more than 1000 and they have less than 4 lives
 * left.
 * 
 * The Contestant has the behavior buyBonusLife
 * that adds a life if canGetBonusLife returns
 * true. The input amount is deducted
 * from the contestant's score.
 * 
 * The string description of the state of the
 * Contestant is shown in the examples below.
 * 
 * Example 1:
 * Peggy: 1512 score; lives: 2
 * 
 * Example 2:
 * Earl: 20 score; lives: 1
 * 
 * @author
 * @version
 */
public class Contestant {

  private String name;
  private int score;
  private int lives;
  
  public Contestant(String name1) {

    name = name1;
    score = 0;
    lives = 4;
  }
  
  public String getName() {

    return name;
  }
  public int getScore() {

    return score;
  }

  public int getLives() {
    
    return lives;
  }

  public int changeScore(int ammount) {

    score = score + ammount;

    if (score < 0) {
      lives--;
      score = 0;
    }
    
    return score;
  }

  public boolean canGetBonusLife() {

    boolean canGet = false;

    if (score > 1000 && lives < 4) {
      canGet = true;
    }
    
    return canGet;
    
  }

  public void buyBonusLife(int ammount) {
    
    if (canGetBonusLife() == true) {
      score = score - ammount;
      lives++;
    }
    
  }
  public String toString() {
    return (name + ": " + score + " score; " + "lives: " + lives);
  }
  
}