import java.util.Stack;

public class StoneWall {
    public static void main(String[] args) {
    int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8}; 
    String A = "())";
    String B = "{[()()]}";
    String C = "abc";
    System.out.println(solution(H));
    /* System.out.println("---------------------------------------------------------\n");
    System.out.println(solution(A));
    System.out.println("---------------------------------------------------------\n");
    System.out.println(solution(B));
    System.out.println("---------------------------------------------------------\n");
    System.out.println(solution(C)); */
  }

    public static int solution(int[] H) {

        //return H.length;

        Stack<Integer> heightsStack = new Stack<>();
        int blocksCounter = 0;

        for (int height = 0; height < H.length; height++)
        {
            if (heightsStack.size() > 0)
            {
                while (heightsStack.size() > 0 && heightsStack.peek() > H[height])
                {
                    heightsStack.pop();
                }
                if (heightsStack.size() > 0)
                {
                    if (heightsStack.peek() < H[height])
                    {
                        blocksCounter++;
                        heightsStack.push(H[height]);
                    }
                }
                else
                {
                    blocksCounter++;
                    heightsStack.push(H[height]);
                }
            }
            else
            {
                blocksCounter++;
                heightsStack.push(H[height]);
            }
        }
        return blocksCounter;
    }
}
