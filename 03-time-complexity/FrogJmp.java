class FrogJmp {

  public static void main(String[] args) {
    int x = 10;
    int y = 85;
    int d = 30;

    System.out.println(solution(x, y, d));
  }

  public static int solution(int X, int Y, int D) {
    long difference = Y - X;

    long plus = 0; // note: need to decide if to "plus one" or not

    if (
      difference % D != 0
    ) plus = 1; // using "mod" to decide // if not "perfectly Divisible", then plus one

    long hop = 0; // number of hops the frog needs to jump

    hop = difference / D;

    hop = hop + plus;

    return (int) hop;
  }
}
