package lesson7;

import java.util.Stack;

public class Fish {
    public int solution_b(int[] A, int[] B) {
        int N = A.length;
        int fishAlive = N;

        // Store downstream fish sizes
        Stack<Integer> sizes = new Stack<Integer>();

        for (int i = 0; i < N; i++) {
            // Check direction of current fish
            boolean isDownstream = B[i] == 1;

            if(isDownstream) {
                sizes.push(A[i]);
                continue;
            }

            // Upstream fish
            while (!sizes.isEmpty()) {
                if (sizes.peek() > A[i]) {
                    fishAlive--;
                    break;
                }

                fishAlive--;
                sizes.pop();
            }
        }

        return fishAlive;
    }

}
