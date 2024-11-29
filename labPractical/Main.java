class Main {
  public static void main(String[] args) {
    testWarmUp();
    testCar();
    testArrayUtility();
  }

  public static void testWarmUp() {
    
    int score = 0;
    int maxScore = 0;

    boolean b1 = WarmUp.highLowGrade(95);
    if (b1 == true)
      score++;
    boolean b2 = WarmUp.highLowGrade(90);
    if (b2 == true)
      score++;
    boolean b5 = WarmUp.highLowGrade(89);
    if (b5 == false)
      score++;
    boolean b3 = WarmUp.highLowGrade(60);
    if (b3 == false)
      score++;
    boolean b4 = WarmUp.highLowGrade(50);
    if (b4 == true)
      score++;
    boolean b6 = WarmUp.highLowGrade(75);
    if (b6 == false)
      score++;

    System.out.println("Score on highLowGrade tests: " + score + " out of 6");

    score = 0;
    String s1 = WarmUp.stars(3);
    if (s1.equals("***"))
      score++;
    String s2 = WarmUp.stars(15);
    if (s2.equals("***************"))
      score++;

    System.out.println("Score on stars tests: " + score + " out of 2");

  }

  public static void testCar() {

      int score = 0;
      int maxScore = 0;
      Car car = new Car("Ford", 2021);
      if (car.getYear() == 2021)
      score++;
      if (car.getMake().equals("Ford"))
      score++;
      if (car.getSpeed() == 0)
      score++;
      if ((car.toString()).substring(0, 10).equals("2021 Ford:"))
      score++;
      maxScore += 4;

      for (int i = 0; i < 5; i++) {
      car.accelerate(5);
      }
      if (car.getSpeed() == 25.0)
      score++;
      maxScore++;

      car.accelerate(100);
      if (car.getSpeed() == 95.0)
      score++;
      maxScore++;

      for (int i = 0; i < 3; i++) {
      car.decelerate(10);
      }
     if (car.getSpeed() == 65.0)
     score++;
     maxScore++;

     car.decelerate(100);
     if (car.getSpeed() == 0.0)
     score++;
     maxScore++;

     if ((car.toString()).substring(0, 10).equals("2021 Ford:"))
     score++;
     maxScore++;
   
     System.out.println("Score on Car tests: " + score + " out of " + maxScore);

  }

  public static void testArrayUtility() {

    int score;
    int maxScore;

    score = 0;
    maxScore = 0;
    int[] orig2 = { 0, 1, 2, 3, 4, 5, 6 };
    if (ArrayUtility.sumExcept(orig2, 2) == 9)
      score++;
    if (ArrayUtility.sumExcept(orig2, 3) == 12)
      score++;
    if (ArrayUtility.sumExcept(orig2, 1) == 0)
      score++;
    if (ArrayUtility.sumExcept(orig2, 7) == 21)
      score++;
    if (orig2[0] == 0 && orig2[1] == 1 && orig2[2] == 2 && orig2[3] == 3 && orig2[4] == 4 && orig2[5] == 5
        && orig2[6] == 6)
      score++;
    maxScore += 5;

    System.out.println("Score on ArrayUtility sumExcept tests: " + score + " out of " + maxScore);

    score = 0;
    maxScore = 0;
    int[] orig = { 0, 1, 2, 3, 4, 5, 6 };
    int[] copy06 = ArrayUtility.copyOfRange(orig, 0, 6);
    int[] copy24 = ArrayUtility.copyOfRange(orig, 2, 4);
    int[] copy6 = ArrayUtility.copyOfRange(orig, 6, 6);
    int[] copy0 = ArrayUtility.copyOfRange(orig, 0, 0);
    if (orig[0] == 0 && orig[1] == 1 && orig[2] == 2 && orig[3] == 3 && orig[4] == 4 && orig[5] == 5 && orig[6] == 6)
      score++;
    
    if (copy06 != null && copy06[0] == 0 && copy06[1] == 1 && copy06[2] == 2 && copy06[3] == 3 && copy06[4] == 4
        && copy06[5] == 5 && copy06[6] == 6)
      score++;
    
    if (copy24 != null && copy24[0] == 2 && copy24[1] == 3 && copy24[2] == 4)
      score++;
    
    if (copy6 != null && copy6[0] == 6)
      score++;
    
    if (copy6 != null && copy0[0] == 0)
      score++;
    
    maxScore += 5;
    
    System.out.println("Score on ArrayUtility copyOfRange tests: " + score + " out of " + maxScore);

    score = 0;
    maxScore = 0;
    String[] ABC = { "A", "B", "C" };
    String[] YZ = { "Y", "Z" };
    String[] c1 = ArrayUtility.combinations(ABC, YZ);
    String[] c2 = ArrayUtility.combinations(YZ, ABC);
    if (ABC[0].equals("A") && ABC[1].equals("B") && ABC[2].equals("C") &&
        YZ[0].equals("Y") && YZ[1].equals("Z"))
      score++;
    
    if (c1 != null && c1[0].equals("AY") && c1[1].equals("AZ") && c1[2].equals("BY") &&
        c1[3].equals("BZ") && c1[4].equals("CY") && c1[5].equals("CZ"))
      score++;
    
    if (c2 != null && c2[0].equals("YA") && c2[1].equals("YB") && c2[2].equals("YC") &&
        c2[3].equals("ZA") && c2[4].equals("ZB") && c2[5].equals("ZC"))
      score++;
    
    maxScore += 3;

    System.out.println("Score on ArrayUtility combinations tests: " + score + " out of " + maxScore);

  }
}