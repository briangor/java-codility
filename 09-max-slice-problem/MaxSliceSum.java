public class MaxSliceSum {

  public static void main(String[] args) {
    int[] A = { 3, 2, -6, 4, 0 };
    int[] B = { -2, -3, 4, -1, -2, 1, 5, -3 };
    int[] C = { 5, -7, 3, 5, -2, 4, -1 };
    int[] D = {-2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(solution(A)); // 5
    System.out.println(solution(B)); // 7
    System.out.println(solution(C)); // 10
    System.out.println(solution(D)); // 6
  }

  public static int solution(int[] A) {
    int maxPrev = A[0];
    int maxCurr = A[0];
    int max = A[0];

    for(int i = 1; i < A.length; i++) {
        maxCurr = Math.max(A[i], maxPrev + A[i]);
        maxPrev = maxCurr;
        max = Math.max(max, maxCurr);
    }

    return max;

    /* int sum = 0;
    int maxSum = A[0];
    int maxSlice = A[0];

    // empty
    if (A.length == 0) return 0;

    for (int i = 0; i < A.length; i++) { //
    //   if (i == A.length - 1) {
    //     sum = A[i];
    //   } else {
    //     sum = sum + A[i]; // 
    //   }
      if (sum >= A[i] || sum > maxSum) {
        sum += A[i];
      } else {
        sum = 0;
        sum += A[i];
      }

      //sum += A[i]; // 0+3=3, 3+2=5, 5-6=-1, -1+4=3, 3+0=3
      // 0-2=-2, -2-3=-5, -5+4=-1, -1-1=-2, -2-2=-4, -4+1=-3, -3+5=2, 2-3=-1
      //0+4=4,  4-1=3,   3-2=1,   1+1=2,  2+5=7,  7-3=4
      // 0+5=5, 5-7=-2, 
      System.out.print(sum + ", ");

      if (sum > maxSlice) {
        maxSlice = sum;
      }
    }
    if (sum > maxSum) {
      maxSum = sum;
    }

    //  if (maxSum > maxSlice) {
    //   maxSlice = maxSum;
    // }
    // { 3, 2,-6, 4, 0 }
    // { 0, 1, 2, 3, 4 } index
    // { -2, -3, 4, -1, -2, 1, 5, -3 }
    return maxSlice; */
  }
}
