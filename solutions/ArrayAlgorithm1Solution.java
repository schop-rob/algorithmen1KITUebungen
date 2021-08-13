package solutions;

public class ArrayAlgorithm1Solution {

  //Teste, ob es möglich ist innnerhalb des Arrays vom ersten zum letzten Element zu gelangen,
  //wenn man gerade nur so viele Schritte gehen darf wie angegeben:
  //Ist also zum Beispiel das Array {1,1,3} gegeben, soll true ausgegeben werden, da es einen Pfad gibt
  public static boolean jumpStartToFinish(int[] numbers) {
    int reachFromStart = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (i > reachFromStart) {
        return false;
      }
      reachFromStart = (i + numbers[i] > reachFromStart) ? i + numbers[i] : reachFromStart;
    }
    return true;
  }

  public static void main(String[] args) {
    int[] testNums1 = new int[]{5,4,3,2,1,0,2};
    int[] testNums2 = new int[]{1,3,0,2};
    System.out.println(jumpStartToFinish(testNums1));
    System.out.println(jumpStartToFinish(testNums2));
  }
}
