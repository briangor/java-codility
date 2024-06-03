public class MaxNonoverlappingSegments {
    public static void main(String[] args) {
        int[] A = { 1, 3, 7, 9, 9 };
        int[] B = { 5, 6, 8, 9, 10 };
        System.out.println(solution(A, B));

    }

    public static int solution(int[] A, int[] B) {
        // System.out.println(A.length);
        // return 0;

        int N = A.length;
        if(N <= 1) {
            return N;
        }

        int cnt = 1;
        int prev_end = B[0];

        int curr;
        for(curr = 1; curr < N; curr++) {
            if(A[curr] > prev_end) {
                cnt++;
                prev_end = B[curr];
            }
        }

        return cnt;
        
    }
}