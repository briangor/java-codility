public class CountDistinctSlices {
    public static void main(String[] args) {
        int M = 6;
        int[] A = { 3, 4, 5, 5, 2 };
        System.out.println(solution(M, A));
        System.out.println("--------");

    }

    public static int solution(int M, int[] A) {
        int count = 0;

        // print all 
        /* for(int i = 0; i < A.length; i++) {
            System.out.print(i+": ");
            for(int j = i; j < A.length; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n\n");
        } */


        // op
        for(int i = 0; i < A.length; i++) {
            System.out.print(i+": ");
            for(int j = i; j < A.length; j++) {
                // condition to check for occurrence
                // add(i,i), add(i, i+1) if unique 
                // if(A[i] < A[j]) okay 
                // System.out.print("("+i+", "+j+")");
                
                if(A[i] <= A[j]) {
                    System.out.print("("+i+", "+j+")");
                    count++;
                }

            }
            System.out.print("\n");
        }
        System.out.print("\n");
        return count;
    }
}