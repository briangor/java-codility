import java.util.ArrayList;

public class MinPerimeterRectangle {
    public static void main(String[] args) {
        int N = 30;
        System.out.println(solution(N));
        System.out.println("--------------");
        /* System.out.println(solution(4));
        System.out.println("--------------");
        System.out.println(solution(16));
        System.out.println("--------------");
        System.out.println(solution(40));
        System.out.println("--------------");
        System.out.println(solution(1));
        System.out.println("--------------"); */
    }

    public static int solution(int N) {
        /* int min = 0;

        // find factors
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                System.out.print(i + " ");
                factors.add(i);
            } 
        }
        System.out.println("\n");
        System.out.println("fators" + factors);
        System.out.println("here0");

        if(factors.size() == 1) {
            return 2 * (N + N);
        }

        //check for vals
        for(int i = 1; i < factors.size(); i++) {
            //System.out.print(factors.get(i) + " ");
            // if(i != factors.size()) { 
            //     for(int j = 0; j < factors.size(); j++) {
            //     // System.out.print(factors.get(j) + " ");
        
            //     int prod = factors.get(i) * factors.get(i+1);
            //     if(prod == N && prod > min && j != factors.size()) {
            //         min = prod;
            //     }
            // }
            // }
            System.out.println("here");
            int factor = N / i;
            if(N % i == 0) {
                
                System.out.println("(" + i + ", " + factor + ")");
                int sum = 2 * (i + factor);
                min = sum;

                if(sum < min) {
                    min = sum;
                }
                System.out.print("sum: " + sum + " min: " + min);

            }
            
            System.out.println(" ");
        }
        System.out.println("\n");
        return min; */

        int sq = (int) Math.sqrt(N);

        int factor = 0;
        int perimeter = 0;
        int minPerimeter = Integer.MAX_VALUE;

        if(Math.pow(sq, 2) != N) {
            sq++;
        } else {
            minPerimeter = 2 * (sq + sq);
        }

        for(int i = 1; i < sq; i++) {
            if(N % i == 0) {
                factor = N / i;
                perimeter = 2 * (factor + i);
                minPerimeter = Math.min(perimeter, minPerimeter);
            }
        }

        return minPerimeter;
    }
}