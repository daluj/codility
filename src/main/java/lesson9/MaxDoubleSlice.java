package lesson9;

public class MaxDoubleSlice {

	public int solution(int[] A) {
        int N = A.length;
        int maxEndingPrevious = 0;
        int maxEnding = 0;
        int maxSlice = 0;

        for (int i = 3; i < N; i++) {
            maxEndingPrevious = Math.max(0, A[i - 2] + maxEndingPrevious);
            maxEnding = Math.max( maxEndingPrevious, A[i - 1] + maxEnding );
            maxSlice = Math.max(maxSlice, maxEnding);
        }

		return maxSlice;
	}
}
