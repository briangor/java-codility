import java.util.Stack;

public class Fish {
    public static void main(String[] args) {
        int[] A = { 4, 3, 2, 1, 5};
        int[] B = { 0, 1, 0, 0, 0};

        System.out.println(solution(A, B));
    }

    public static int solution(int[] A, int[] B) {
        int len_a = A.length; // 5
        int len_b = B.length; // 5

        Stack<Integer> liveFish = new Stack<>();
        for(int i = 0; i < len_a; i++) {
            if(liveFish.isEmpty()) {
                liveFish.push(i);
            } else {
                while(!liveFish.isEmpty() && B[i] - B[liveFish.peek()] == -1 && A[liveFish.peek()] < A[i]) {
                    liveFish.pop();
                }
                if(liveFish.isEmpty()) {
                    liveFish.push(i);
                } else if(B[i] - B[liveFish.peek()] != -1) {
                    liveFish.push(i);
                }
            }
        }
        return liveFish.size();
    }
}