class OddOccurencesInArray {
    public static void main(String[] args) {
        int[] A = {9,3,9,3,9,7,9};
        //int[] A = {1,2,3,4,5,6,7};

        for(int i: A) {
            System.out.print(i);
        }

        System.out.println(solution(A));
    }

    public static int solution(int[] A){
        int el = 0;
        System.out.println("\n----");

        int unpaired;
		unpaired = A[0];

		for(int i=1; i< A.length; i++){
			unpaired = unpaired ^ A[i]; // xor
		}

		return unpaired;

        // int len = A.length;
        // int j = 0;
        // for(int i = 0; i < A.length; i++) {
        //     int count = 0;
        //     for(j = i; j < len; j++) {
        //         System.out.print(A[j]);

        //         if(A[j] )    
        //     }

            /* for(int j=0; j<A.length; j++) {
                
                System.out.print(A[j]);
                if (i == A[j]) {
                    count++;
                }
                //System.out.print(i);
            } */
            /* if (count < 1) {
                System.out.println(i + "has no other");
            } */
            //System.out.println(i);
            // System.out.println("\n");
            
        // }

        //return el;
    }
}

// A = {9,3,9,3,9,7,9}

// loop though each element. 
// for index i => check all occurrences 
// if not > 1, record it x
// at end return x