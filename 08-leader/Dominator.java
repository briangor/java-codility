import java.util.*;

public class Dominator {

  public static void main(String[] args) {
    int[] A = { 3, 4, 3, 2, 3, -1, 3, 3 };
    //System.out.println(solution(A));
    int result = solution(A);
    System.out.println(result);
  }

  public static int solution(int[] A) {
    // return A.length;

    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    int dominatorKey = -1;
    int dominatorValue = -1;

    for (int i = 0; i < A.length; i++) {
      if (hm.containsKey(A[i])) {
        hm.put(A[i], hm.get(A[i]) + 1);
      } else {
        hm.put(A[i], 1);
      }
    }
    if (hm.size() == 0) return -1;

    if (hm.size() == 1) return 0;

    for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
      if (entry.getValue() > dominatorValue) {
        dominatorKey = entry.getKey();
        dominatorValue = entry.getValue();
      }
    }

    if (dominatorValue > (A.length / 2)) {
      for (int i = 0; i < A.length; i++) {
        if (A[i] == dominatorKey) {
          return i;
        }
      }
    }
    return -1;
    /* 
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < A.length; i++) {
      if (stack.empty()) stack.push(A[i]); else {
        int topElem = stack.peek().intValue();
        if (topElem == A[i]) {
          stack.push(A[i]);
        } else {
          stack.pop();
        }
      }
    }

    if (stack.empty()) return -1;

    int elem = stack.peek().intValue();
    int count = 0;
    int index = 0;
    for (int i = 0; i < A.length; i++) {
      if (elem == A[i]) {
        count++;
        index = i;
      }
    }

    if (count > ((double) A.length / 2.0)) return index; else return -1;
 *//* 
    int candidate = 0;
    int counter = 0;

    // Find candidate for leader
    for (int i = 0; i < array.length; i++) {
      if (counter == 0) candidate = i;

      if (array[i] == array[candidate]) {
        counter++;
      } else {
        counter--;
      }
    }

    // Count candidate occurrences in array
    counter = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == array[candidate]) counter++;
    }

    // Check that candidate occurs more than array.length/2
    return counter > array.length / 2 ? candidate : -1;
 */
  }
}
