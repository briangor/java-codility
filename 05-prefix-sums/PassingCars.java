// Scores 50%
public class PassingCars {
    public static void main(String[] args) {
        int[] A = {0,1,0,1,1};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int len = A.length;
        int count = 0;

       /*  // checks
        if (len < 1 || len > 100000) {
            return 0;
        } else if (A.) */

        System.out.println("---");
        for(int i = 0; i < len; i++) {
            for(int j = i; j < len; j++) {
                System.out.print(A[j]);

                // check if A[i]==0 => east then create list of (A[i], A[1])
                if(A[i] == 0 && A[j] == 1) {
                    //System.out.print("=> (" +A[i] +","+A[j]+"), ");
                    count++;
                }
                if (count > 1000000000) {
                    return -1;
                } 
            }
            System.out.println("\n");
        }
        System.out.println("---");
        return count;
    }
}


// scores 100%
/*
class Solution {
    public int solution(int[] A) {
        int zeros = 0, count = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 0) zeros++;                    
            if (A[i] == 1) count += zeros;    
            if (count > 1000000000) return -1;
        }
        return count;
    }
}
*/
