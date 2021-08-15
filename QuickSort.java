public class QuickSort {
  public static final String GREEN = "\u001B[32m";
  public static final String BLUE = "\u001B[34m";
  public static final String RED = "\u001B[31m";

  static class Element {
    public static final String RESET = "\u001B[0m";
    int value;
    String color;

    private Element(int val, String c) {
      color = c;
      value = val;
    }

    public int getValue() {
      return value;
    }

    @Override
    public String toString() {
      return color + value + RESET;
    }
  }
  public static void main(String[] args) {
    Element[] el  = new Element[10];
    el[0] = new Element(9, GREEN);
    el[1] = new Element(3, GREEN);
    el[2] = new Element(3, RED);
    el[3] = new Element(2, GREEN);
    el[4] = new Element(8, RED);
    el[5] = new Element(9, BLUE);
    el[6] = new Element(8, GREEN);
    el[7] = new Element(1, BLUE);
    el[8] = new Element(9, RED);
    el[9] = new Element(8, BLUE);
    arrayPrint(el);
    quickSort(el, 0, 9);
    arrayPrint(el);
  }

  public static void quickSort(Element[] elements, int startIndex, int endIndex) {
    if (startIndex >= endIndex) {
      return;
    }
    Element pivot = elements[startIndex];
    swap(elements, startIndex, endIndex);
    int i = 0;
    for(int cursor = 0; cursor < endIndex; cursor++) {
      if (elements[cursor].getValue() <= pivot.getValue()) {
        swap(elements, cursor, i);
        i++;
      }
    }
    System.out.println("Starting new sorting for bounds (" + startIndex + "|" + (i - 1) + ") and (" + (i+1) + "|" + endIndex + ").");
    swap(elements, i, endIndex);
    quickSort(elements, startIndex, i - 1);
    quickSort(elements, i + 1, endIndex);
  }

  private static void swap(Element[] elements, int x, int y) {
    Element temp = elements[x];
    elements[x] = elements[y];
    elements[y] = temp;
  }

  public static void arrayPrint(Element[] e) {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < e.length; i++) {
      s.append(e[i] + " ");
    }
    System.out.println(s.toString());
  }
}
