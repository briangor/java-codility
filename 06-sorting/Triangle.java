import java.util.Arrays;

public class Triangle {

  public static void main(String[] args) {
    int[] A = { 10, 2, 5, 1, 8, 20 }; // returns 1 {10,5,8}
    int[] B = { 10, 50, 5, 1 }; // returns 0
    int[] C = { 2147483647, 2147483647, 2147483647 }; // = 1 -> for overflow
    int[] D = { 1, 2 }; // = 0 -> two elements
    int[] E = { -1, -1, -1 }; // = 0 -> negatives
    System.out.println(solution(A));
  }

  public static final int NOT_TRIANGULAR = 0;
  public static final int TRIANGULAR = 1;

  public static int solution(int[] A) {
    Arrays.sort(A);
    int length = A.length;
    for (int p = 0, q = 1, r = 2; p < (length - 2); ++p, ++q, ++r) {
      if (A[p] >= 0 && A[p] > A[r] - A[q]) {
        if (isTriangular(A[p], A[q], A[r])) {
          return TRIANGULAR;
        }
      }
    }
    return NOT_TRIANGULAR;
  }

  public static boolean isTriangular(int P, int Q, int R) {
    return (P > R - Q) && (Q > P - R) && (P > Q - R);
  }
}
