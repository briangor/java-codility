public class MaxProfit {
    public static void main(String[] args) {
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        if (A.length <= 1)
			return 0;

		int minPrice = A[0];
		int maxProfit = 0;

		for (int i = 1; i < A.length; i++) {
			if (A[i] < minPrice)
				minPrice = A[i];
			else {
				int curProfit = A[i] - minPrice;
				if (curProfit > maxProfit)
					maxProfit = curProfit;
			}
		}
		return maxProfit;

        /* int max = 0;
        int res = 0;

        System.out.print("---------\n");
        for(int i = 0; i < A.length; i++) {
            System.out.print("A["+i+"]: ");

            // find max

            for(int j = i; j < A.length; j++) {
                System.out.print(A[j] + ",");
            }
            for(int j = i + 1; j < A.length; j++) {
                System.out.print("\n"+ "A["+i+"] - " + "A["+j+"] = " + A[i] + "-" + A[j] + "=" + (A[i] - A[j]));
                res = A[j] - A[i];
                if(res > max) {
                    max = res;
                }
            }
            System.out.print("\n--\n");
        }
        System.out.print("---------\n\n");
        
        
        
        return max; */
    }
}