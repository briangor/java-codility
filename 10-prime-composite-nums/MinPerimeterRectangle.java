import java.util.ArrayList;

public class MinPerimeterRectangle {
    public static void main(String[] args) {
        int N = 30;
        System.out.println(solution(N));
    }

    public static int solution(int N) {
        int min = 0;

        // find factors
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                System.out.print(i + " ");
                factors.add(i);
            } 
        }
        System.out.println("\n");

        //check for vals
        for(int i = 0; i < factors.size(); i++) {
            //System.out.print(factors.get(i) + " ");
            if(i != factors.size()) { 
                for(int j = 0; j < factors.size(); j++) {
                // System.out.print(factors.get(j) + " ");
        
                int prod = factors.get(i) * factors.get(i+1);
                if(prod == N && prod > min && j != factors.size()) {
                    min = prod;
                }
            }
            }
            
            System.out.println(" ");
        }
        System.out.println("\n");
        return N;
    }
}