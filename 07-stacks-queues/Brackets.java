import java.util.*;

public class Brackets {

  public static void main(String[] args) {
    String S = "{[()()]}";
    String A = "abc";
    String B = "([)()])";
    System.out.println(solution(S));
  }

  public static int solution(String S) {
    /* if (S.isEmpty()) {
        return 0;
    } */

    Stack<Character> stack = new Stack<Character>();

    for(int i = 0; i < S.length(); i++) {
        char c = S.charAt(i);
        if(c == '{' || c == '[' || c == '(') {
            stack.push(c); 
        } else if (stack.size() > 0 ) {
            if( (c == ')' && stack.pop() != '(') || (c == ']' && stack.pop() != '[') || (c == '}' && stack.pop() != '{')) return 0;
            // if(c == ']' && stack.pop() != '[') return 0;
            // if(c == '}' && stack.pop() != '{') return 0;
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


/*
Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if(c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if( stack.size() > 0) {
                if((c == ')' && stack.pop() != '(') || (c == ']' && stack.pop() != '[') || (c == '}' && stack.pop() != '{')) return 0;
            } else {
                return 0;
            }
        }

        if(stack.size() == 0) {
            return 1;
        } else {
            return 0;
        }

 */