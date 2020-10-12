package lesson7;

import java.util.Stack;

public class StoneWall {

	public int solution(int[] H) {
        int minBlocks = 0;
        int N = H.length;

        // Check for new blocks
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && stack.peek() > H[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                stack.push(H[i]);
                minBlocks++;
            } else if(H[i] > stack.peek()){
                stack.push(H[i]);
                minBlocks++;
            }
        }

		return minBlocks;
	}

}
