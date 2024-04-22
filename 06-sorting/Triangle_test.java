import java.util.Arrays;
import java.util.List;

public class Triangle {

  public static void main(String[] args) {
    int[] A = { 10, 2, 5, 1, 8, 20 }; // returns 1 {10,5,8}
    int[] B = { 10, 50, 5, 1}; // returns 0
    System.out.println(solution(A));
  }

  public static int solution(int[] A) {
    // variables
    int length = A.length;
    int P = 0; int Q = 0; int R = 0;
    int index = 0;
    int[] indeces = {};

    for(int i = 0; i < length; i++) {
      indeces[i].add(i);
    }

    // print array
    System.out.println("Array");
    for (int i = 0; i < length; i++) {
      System.out.print(A[i] + " ");
    }
    System.out.println("\n");

    /* // sort array
    Arrays.sort(A);
    System.out.println("Sorted Array");
    for (int i = 0; i < length; i++) {
      System.out.print(A[i] + " ");
    }
    System.out.println("\n"); */

    // A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N
/*  A[P] + A[Q] > A[R],
    A[Q] + A[R] > A[P],
    A[R] + A[P] > A[Q] */
/* 
    (0,2,4) = { 10,5,8 }
    {10, 2, 5, 1, 8, 20}
    [0,  1, 2, 3, 4, 5] index 
    */

    System.out.println("----------");
    // chose P,Q,R values
    for (int i = 0; i < length; i++) {
      //System.out.print(A[i] + " ");
      P = A[i];
      for (int j = i; j < length; j++) {
        System.out.print(A[j] + " ");
        // P = A[i];
        Q = j < length - 1 ? A[j+1] : A[j-1];
        R = j < length - 2 ? A[j+2] : A[j];

        // loop 1: P, Q then loop R
        // loop 2: P, R constant then loop Q

        if( (P+Q>R) || (Q+R>P) || (R+P>Q) && ( P < Q && Q < R) ) {
            //System.out.println("Found!");
            System.out.println("{P,Q,R} = {"+P+","+Q+","+R+"}");
        }

      }
      System.out.print("\n");
      
    }
    System.out.println("----------");

    System.out.println("\n");

    System.out.println(P +"+"+ Q +">"+ R);
    System.out.println(Q +"+"+ R +">"+ P);
    System.out.println(R +"+"+ P +">"+ Q);
    System.out.println("\n");


    /* // finding index
    index = Arrays.binarySearch(A, 2);
    int index_ = index < 0 ? -1 : index;
    System.out.println(index_); */

    return 1;
  }
}
