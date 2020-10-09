package lesson7;

import java.util.Stack;

public class Nesting {

	public int solution(String S) {
        int N = S.length();
        int nested = 0;

        Stack<Character> stack = new Stack<Character> ();

        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);

            if(!stack.isEmpty()) {
                char peek = stack.peek();

                if (peek == '(' && c == ')') {
                    stack.pop();
                    continue;
                }
            }

            stack.push(c);
        }

        if(stack.isEmpty()) nested = 1;

		return nested;
	}
}
