//import java.util.ArrayList;
//import java.util.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

  public static void main(String[] args) {
    int[] A = { 2, 1, 1, 2, 3, 1 };
    System.out.println(solution(A));
  }

  public static int solution(int[] A) {
    if (A.length == 0) return 0;

    Set<Integer> setA = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      setA.add(A[i]);
    }
    return setA.size();
    
    /*for (int i = 0; i < A.length; i++) {
      System.out.print(A[i] + ", ");
    }

    int count = 1;
    int[] arr = {A[0]};
    //ArrayList<Integer> arr = new ArrayList<Integer>(0);

    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
    //arrayList.add(7);
    //arr = arrayList.toArray(arr);

    if (A.length == 0) {
      return 0;
    }

    // logic
    //boolean[] bol = new boolean[A.length];
    // add distinct
    for (int i = 0; i < A.length; i++) {
      //if(A[i] == i)
      // for each element, loop through arr, if not exist, then add, if exists then skip
      for (int j = 0; j < arr.length; j++) {
        if (A[i] != arr[j]) {
          arrayList.add(A[i]);
          //System.out.println(j + ": " + arr[j]);
          System.out.println(arrayList);
        }
      }
      arr = arrayList.toArray(arr);
    }

    System.out.println("\n");
    return 0;*/
  }
}
