public class CyclicRotation {

  public static int[] solution(int[] A, int K) {
    int temp = 0;

    System.out.println(" ");
    for (int a : A) {
      System.out.print(a);
    }
    System.out.println(" ");

    //check for empty
    if (A.length == 0) {
      return A;
    }

    //no of times
    for (int i = 0; i < K; i++) {
      System.out.print(i + 1 + " times" + "\n");

      // cycle
      // [0,1,2,3,4]
      // [3,8,9,7,6]
      // [6,3,8,9,7]

      // temp=3
      // j=4, A[0] = A[4] => A[0]=6
      // j=3, A[4] = A[3] => A[4]=7
      // j=2, A[3] = A[2] => A[3]=9
      // j=1, A[2] = A[1] => A[2]=8
      // j=0, A[1] = temp => A[1]=3
      // A = {6,3,8,9,7}

      temp = A[0];
      for (int j = A.length - 1; j >= 0; j--) {
        //System.out.println(j);
        if (j == A.length - 1) {
          // asign to front
          A[0] = A[j];
        } else if (j == 0) {
          A[1] = temp;
        } else {
          A[j + 1] = A[j];
        }
      }
      System.out.println("-- end cycle --");
    }
    System.out.println(" ");

    //print the array
    for (int a : A) {
      System.out.print(a);
    }
    System.out.println(" ");
    System.out.println("---");
    return A;
  }

  public static void main(String[] args) {
    int[] A = { 3, 8, 9, 7, 6 };
    int K = 1;

    int[] A2 = { 3, 8, 9, 7, 6 };
    int K2 = 3;

    int[] A3 = { 0, 0, 0 };
    int K3 = 1;

    int[] A4 = { 1, 2, 3, 4 };
    int K4 = 4;

    int[] A5 = {};
    int K5 = 1;

    System.out.println("+++++++++++++++++++++++++++");
    System.out.println(solution(A, K));
    System.out.println("+++++++++++++++++++++++++++");
    System.out.println(solution(A2, K2));
    System.out.println("+++++++++++++++++++++++++++");
    System.out.println(solution(A3, K3));
    System.out.println("+++++++++++++++++++++++++++");
    System.out.println(solution(A4, K4));
    System.out.println("+++++++++++++++++++++++++++");
    System.out.println(solution(A5, K5));
    System.out.println("+++++++++++++++++++++++++++");
  }
}
/**
        int temp = 0;

        if(A.length == 0) {
            return A;
        }

        for(int i = 0; i <K; i++) {    
            temp = A[0];
            for(int j = A.length-1; j >= 0; j--) {
                if(j == A.length-1) {
                    A[0] = A[j];
                } else if(j == 0) {
                    A[1] = temp;
                } else {
                    A[j+1] = A[j];
                }
            }
        }

        return A;


 */
