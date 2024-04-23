import java.util.*;

public class Nesting {

  public static void main(String[] args) {
    String S = "(()(())())"; 
    String A = "())";
    String B = "{[()()]}";
    String C = "abc";
    System.out.println(solution(S));
    System.out.println("---------------------------------------------------------\n");
    System.out.println(solution(A));
    System.out.println("---------------------------------------------------------\n");
    System.out.println(solution(B));
    System.out.println("---------------------------------------------------------\n");
    System.out.println(solution(C));
  }

  public static int solution(String S) {
    Stack<Character> stack = new Stack<Character>();

    for(int i = 0; i < S.length(); i++) {
        char c = S.charAt(i);
        if(c == '(') {
            stack.push(c); 
        } else if (stack.size() > 0 ) {
            if(c == ')' && stack.pop() != '(') return 0;
        } else {
            return 0;
        }
    }

    if(stack.size() == 0) {
        return 1;
    } else {
        return 0;
    }
    
  }
}