// https://app.codility.com/programmers/lessons/1-iterations/
// Iterations 

class BinaryGap {
    public static int solution(int N) {
        String bin = Integer.toBinaryString(N);
        int len = bin.length();
        int count = 0;
        int maxLength = 0;
        boolean isCounting = false;

        for(int i = 0; i < len; i++) {
            if(bin.charAt(i) == '1' && isCounting == false) {
                isCounting = true;
                count = 0;
            } 
            if(bin.charAt(i) == '0' && isCounting) {
                count += 1;
            }
            
            if(bin.charAt(i) == '1' && isCounting) {
                if(count > maxLength) {
                    maxLength = count;
                }
                count = 0;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(solution(9));
    }
}
