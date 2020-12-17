import java.util.*;
public class Tester1 {

  public static void main(String[]args) {
  int[] one = {-900,23,239,-39, 2344554, -23450, 203899};
  Sorts.bubbleSort(one);
  System.out.println(Arrays.toString(one));
  int[] two = {45,45,66};
  Sorts.bubbleSort(two);
  System.out.println(Arrays.toString(two));
  int[] three = {3,-3,4};
  Sorts.bubbleSort(three);
  System.out.println(Arrays.toString(three));

  }

}
