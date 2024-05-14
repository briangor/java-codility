public class ChocolatesByNumbers {
    public static void main(String[] args) {
        int N = 10; int M = 4;

        System.out.println(solution(N,M));
        System.out.println("-----------");
    }

    public static int solution(int N, int M) {
        int count = 1;

        // get choco from the fn
        int i = 0;
        
        while(i < N) {
            i = (i + M) % N; // 4,8,2,6,
            if(i == 0) { return count; }
            count++;
            //System.out.print(i + " ");
        }

        return count;

    }
}