package lesson9;

/**
 * https://en.wikipedia.org/wiki/Maximum_subarray_problem
 */
public class MaxDoubleSlice {

    /**
     * O(N) complexity
     * @param A
     * @return
     */
	public int solution(int[] A) {
        int N = A.length;
        int previousSum = 0;
        int currentSum = 0;
        int maxDoubleSlice = 0;

        for (int i = 3; i < N; i++) {
            previousSum = Math.max(0, A[i - 2] + previousSum);
            currentSum = Math.max( previousSum, A[i - 1] + currentSum );
            maxDoubleSlice = Math.max(maxDoubleSlice, currentSum);
        }

		return maxDoubleSlice;
	}
}
