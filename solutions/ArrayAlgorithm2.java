package solutions;

public class ArrayAlgorithm2 {
  //Baue ein neues Array, das für jeden Index in numbers die Anzahl an Elementen angibt,
  //die kleiner als aktuelle Element sind
  //Es darf angenommen werden, dass eine Zahl nur ein Mal vorkommt, Input array darf manipuliert werden
  //Laufzeit sollte in O (n*log(n)) liegen
  public int[] getAccordingRank(int[] numbers) {
    return new int[]{1,2,3}; //ersetzen
  }

  public void mergeSort(int[] numb, int startIndex, int endIndex) {
    if (startIndex == endIndex) {
      return;
    }
    int midIndex = startIndex + ((endIndex - startIndex) / 2);
    mergeSort(numb, startIndex, midIndex);
    mergeSort(numb, ++midIndex, endIndex);

    
  }


  public static void main(String[] args) {
    int[] testNumbers1 = new int[]{5,2,7,6,1};
    int[] testNumbers2 = new int[]{9,7,2};
  }
}
