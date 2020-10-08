package lesson6;

import java.util.Arrays;

public class MaxProductThree {

	public int solution(int[] A) {
        int N = A.length;
        Arrays.sort(A);

        int prod_a = A[N - 1] * A[N - 2] * A[N - 3];
        int prod_b = A[0] * A[1] * A[N - 1];
        
		return Math.max(prod_a, prod_b);
	}

}
