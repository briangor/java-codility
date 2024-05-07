public class CountFactors {

  public static void main(String[] args) {
    int N = 24;
    System.out.println(solution(N));

    System.out.println("-------------");
    System.out.println(solution(7));
    System.out.println("-------------");
    System.out.println(solution(39916800));
    System.out.println("-------------");
    System.out.println(solution(39992976));
    System.out.println("-------------");
    System.out.println(solution(2147483647));
    System.out.println("-------------");
    // System.out.println(solution(0));
    // System.out.println("-------------");
    // System.out.println(solution(0));
    // System.out.println("-------------");
    
  }

  public static int solution(int N) {
    /* int count = 0;

    if (N <= 0) {
      return 0;
    }

    for (int i = N; i > 0; i--) {
      // System.out.print(i + ", ");
      if (N % i == 0) {
        System.out.print(i + ", ");
        count++;
      }
    }

    System.out.print("\n\n");
    return count; */


    // Note: using a brute force approach (checking every number below N) wouldn’t pass this problem because it would take too long.
    // The strategy is to find all factors by only checking up to square root of N and incrementing by 2 each time N % i == 0.

    int factors = 0;
    int sqRootN = (int) Math.sqrt(N);

    if(Math.pow(sqRootN, 2) != N) {
        sqRootN++; // round up for any non-perfect squares
    } else {
        factors++; // perfect squares have an additional factor
    }

    for(int i = 1; i < sqRootN; i++) {
        if(N % i == 0) {
            factors += 2;
        }
    }

    return factors;
  }
}
