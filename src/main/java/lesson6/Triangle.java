package lesson6;

import java.util.Arrays;

public class Triangle {

	public int solution(int[] A) {
        int N = A.length;
        int existsTriplet = 0;

        // Check if the number of elements is greater than 3
        if(N < 3) return existsTriplet;

        Arrays.sort(A);

        for (int i = 2; i < N; i++) {
            int P = i - 2;
            int Q = i - 1;
            int R = i;
            // As the elements from A are too big, the addition may fail
            if(A[P] > A[R] - A[Q]) {
                existsTriplet = 1;
                break;
            }
        }
		return existsTriplet;
	}

}
