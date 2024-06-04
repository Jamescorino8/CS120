class Main {
  public static void main(String[] args) {
    testWarmUp();
    testContestant();
    testArrayUtility();
  }

  public static void testWarmUp() {
    /**
    int score = 0;
    int maxScore = 0;

    boolean b1 = WarmUp.near10(15);
    if (b1 == false)
      score++;
    boolean b2 = WarmUp.near10(22);
    if (b2 == true)
      score++;
    boolean b5 = WarmUp.near10(78);
    if (b5 == true)
      score++;
    boolean b3 = WarmUp.near10(83);
    if (b3 == false)
      score++;
    boolean b4 = WarmUp.near10(50);
    if (b4 == true)
      score++;
    boolean b6 = WarmUp.near10(59);
    if (b6 == true)
      score++;
    boolean b7 = WarmUp.near10(6);
    if (b7 == false)
      score++;

    System.out.println("Score on near10 tests: " + score + " out of 7");

    score = 0;
    String s1 = WarmUp.repeat("hello");
    if (s1.equals("hheelllloo"))
      score++;
    String s2 = WarmUp.repeat("ox");
    if (s2.equals("ooxx"))
      score++;
    String s3 = WarmUp.repeat("curious");
    if (s3.equals("ccuurriioouuss"))
      score++;

    System.out.println("Score on repeat tests: " + score + " out of 3");
**/
  }

  public static void testContestant() {
    /**
    int score = 0;
    int maxScore = 0;

    Contestant peggy = new Contestant("Peggy");
    if (peggy.getName().equals("Peggy"))
      score++;
    if (peggy.getScore() == 0)
      score++;
    if (peggy.getLives() == 4)
      score++;
    if (peggy.toString().equals("Peggy: 0 score; lives: 4"))
      score++;
    maxScore += 4;
    
    peggy.changeScore(-100);
    if (peggy.getScore() == 0)
      score++;
    if (peggy.getLives() == 3)
      score++;
    if (!peggy.canGetBonusLife())
      score++;
    maxScore += 3;

    peggy.changeScore(1001);
    if (peggy.getScore() == 1001)
      score++;
    if (peggy.getLives() == 3)
      score++;
    if (peggy.canGetBonusLife())
      score++;
    maxScore += 3;

    peggy.buyBonusLife(500);
    if (peggy.getScore() == 501)
      score++;
    if (peggy.getLives() == 4)
      score++;
    if (!peggy.canGetBonusLife())
      score++;
    maxScore += 3;

    peggy.changeScore(1000);
    if (!peggy.canGetBonusLife())
      score++;
    if (peggy.toString().equals("Peggy: 1501 score; lives: 4"))
      score++;
    maxScore += 2;

    System.out.println("Score on Contestant tests: " + score + " out of " + maxScore);

    **/
    

  }

  public static void testArrayUtility() {

    int score;
    int maxScore;

    score = 0;
    maxScore = 0;
    int[] orig2 = { 70, 98, 45, 71, 82 };
    ArrayUtility.curve(orig2, 5);
    if (orig2[0] == 75 && orig2[1] == 98 && orig2[2] == 50 && orig2[3] == 76 && orig2[4] == 82)
      score++;

    int[] orig3 = { 0, 100, 71, 97, 86, 60 };
    ArrayUtility.curve(orig3, 3);
    if (orig3[0] == 3 && orig3[1] == 100 && orig3[2] == 74 && orig3[3] == 97 && orig3[4] == 86 && orig3[5] == 63)
      score++;
    maxScore += 2;

    System.out.println("Score on ArrayUtility curve tests: " + score + " out of " + maxScore);

    score = 0;
    maxScore = 0;
    int[] orig = { 10, 2, 6, 33, 8, 23, 5, 60 };
    int[] copy06 = ArrayUtility.largerThan(orig, 12);
    int[] copy24 = ArrayUtility.largerThan(orig, 100);
    int[] copy6 = ArrayUtility.largerThan(orig, 23);

    if (orig[0] == 10 && orig[1] == 2 && orig[2] == 6 && orig[3] == 33 && orig[4] == 8 && orig[5] == 23 && orig[6] == 5
        && orig[7] == 60)
      score++;
    if (copy06 != null && (copy06.length == 3) && copy06[0] == 33 && copy06[1] == 23 && copy06[2] == 60)
      score++;
    if (copy24 == null)
      score++;
    if (copy6 != null && (copy6.length == 2) && copy6[0] == 33 && copy6[1] == 60)
      score++;
    maxScore += 4;

    System.out.println("Score on ArrayUtility largerThan tests: " + score + " out of " + maxScore);

    score = 0;
    maxScore = 0;
    String[] a1 = { "A", "B", "C", "D", "E" };
    String[] a2 = { "D", "P", "A", "U" };
    int c1 = ArrayUtility.numInCommon(a1, a2);
    if (c1 == 2)
      score++;

    String[] a3 = { "Abe", "Jack", "Karen", "Sam", "Ellen", "Joe", "Eva", "Elsa" };
    String[] a4 = { "Dan", "Sam", "Peter", "Alice", "Robin", "Elsa", "Abe", "Ann", "Karen" };
    int c2 = ArrayUtility.numInCommon(a3, a4);
    if (c2 == 4)
      score++;

    String[] a5 = { "Abe", "Karen" };
    String[] a6 = { "Karen", "Joe" };
    int c3 = ArrayUtility.numInCommon(a5, a6);
    if (c3 == 1)
      score++;

    maxScore += 3;

    System.out.println("Score on ArrayUtility numInCommon tests: " + score + " out of " + maxScore);

  }
}