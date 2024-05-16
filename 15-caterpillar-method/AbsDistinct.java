import java.util.*;

public class AbsDistinct {
    public static void main(String[] args) {
        int[] A = {-5, -3, -1, 0, 3, 6}; // 5
        int[] B = {}; // 0
        int[] C = {0}; // 1
        int[] D = {0, 0, 0, 0}; // 1
        int[] E = {0, 2, 6, 1, 7}; // ? should be non-decreasing. check if array is sorted? 
        System.out.println(solution(A));
        System.out.println("---------");
        System.out.println(solution(B));
        System.out.println("---------");
        System.out.println(solution(C));
        System.out.println("---------");
        System.out.println(solution(D));
        System.out.println("---------");
        System.out.println(solution(E));
        System.out.println("---------");
    }

    public static int solution(int[] A) {
        
        Set<Integer> dist = new HashSet<>();

        // if(A.length == 0) return 0;

        for(int i = 0; i < A.length; i++) {
            dist.add(Math.abs(A[i]));
        }
        
        return dist.size();
    }
}