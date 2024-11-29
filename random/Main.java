import java.util.Random;
class Main {
  public static void main(String[] args) {
    int num = 0;
    Random random = new Random();
    for (int i = 0; i != 100; i++) {
      num = random.nextInt(10) + 20;
      System.out.println(num);
    }
  }
}