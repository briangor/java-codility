public class TieRopes {
    public static void main(String[] args) {
        int K = 4;
        int[] A = {1,2,3,4,1,1,3};
        System.out.print(solution(K, A));
    }

    public static int solution(int K, int[] A) {
        int len = A.length;
        int count = 0;
        int sum = 0;

        for(int i = 0; i < len; i++) {
            System.out.print(A[i] + ", ");
            if(K > sum) {
                sum = sum + A[i];
                count++;
            }
        }
        System.out.println("\n");
        return count;
    }
}