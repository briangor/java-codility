public class EquiLeader {

  public static void main(String[] args) {
    int[] A = { 4, 3, 4, 4, 4, 2 };
    System.out.println(solution(A));
  }

  public static int solution(int[] A) {
    if (A.length == 1) return 0;

    int value = A[0];
    int size = 0;
    for (int i = 0; i < A.length; i++) {
      if (size == 0) {
        size++;
        value = A[i];
      } else {
        if (A[i] == value) {
          size++;
        } else {
          size--;
        }
      }
    }

    int candidate = -1;
    int count = 0;
    if (size > 0) {
      candidate = value;
    }

    for (int i = 0; i < A.length; i++) {
      if (A[i] == candidate) {
        count++;
      }
    }

    if (count <= A.length / 2) {
      return 0;
    }

    int leader = candidate;
    int equiCount = 0;
    int leaderCount = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == leader) {
        leaderCount++;
      }
      if (
        leaderCount > (i + 1) / 2 &&
        (count - leaderCount) > (A.length - i - 1) / 2
      ) {
        equiCount++;
      }
    }

    return equiCount;
  }
}
