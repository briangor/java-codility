public class PermCheck {

  public static int solution(int[] A) {
    /* int start = A[0];
        boolean[] bitmap = new boolean[start+1];
        for(int i = 0; i < A.length; i++){
            if(!bitmap[A[i]]){
                bitmap[A[i]] = true;
                start--;
                if(start == 0) return 1;
            }

        }
        return 0; */// 8%
    int[] counter = new int[A.length];
    for (int i = 0; i < A.length; i++) {
      if (A[i] < 1 || A[i] > A.length) {
        // Out of range
        return 0;
      } else if (counter[A[i] - 1] == 1) {
        // met before
        return 0;
      } else {
        // first time meet
        counter[A[i] - 1] = 1;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int[] A = { 4, 1, 3 };
    System.out.println(solution(A));
  }
}
/*
A = {4,1,3,2} return 1
A = {4,1,3} return 0

A = [1 ... N]
*/


