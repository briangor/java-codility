import java.util.Arrays;

class MaxProductOfThree {

  public static void main(String[] args) {
    int[] A = { -30, 1, 2, -2, 5, 6 };
    // int[] A = { 9, 1, -2, -2, -9, 10 };

    // solution(A);
    System.out.println(solution(A));
  }

  public static int solution(int[] A) {
    int P, Q, R, a, b, c; // where a>b>c
    int maximumLeft = Integer.MIN_VALUE, maximumRight = Integer.MIN_VALUE;
    int length = A.length;

    System.out.println("Array");
    for (int i = 0; i < length; i++) {
      System.out.print(A[i] + " ");
    }
    System.out.println("\n");

    // sort
    Arrays.sort(A);
    System.out.println("Sorted Array");
    for (int num : A) {
      System.out.print(num + " ");
    }

    P = A[length - 3];
    Q = A[length - 2];
    R = A[length - 1];
    maximumRight = P * Q * R;

    System.out.println("\n");
    System.out.println("maxRight");
    System.out.println("P: " + P);
    System.out.println("Q: " + Q);
    System.out.println("R: " + R);
    System.out.println("P * Q * R = " + maximumRight);

    P = A[0];
    Q = A[1];
    R = A[length - 1];
    maximumLeft = P * Q * R;

    System.out.println("\n");
    System.out.println("maxLeft");
    System.out.println("P: " + P);
    System.out.println("Q: " + Q);
    System.out.println("R: " + R);
    System.out.println("P * Q * R = " + maximumLeft);

    System.out.println("\n");

    return maximumRight > maximumLeft ? maximumRight : maximumLeft;
  }
}
