package lesson9;

public class MaxSliceSum {

    /**
     * Find largest sum. O(N) complexity
     * @param A
     * @return
     */
	public int solution(int[] A) {
        int maxSlice = -1000000;
        int maxEnding = 0;

        for (int a : A) {
            maxEnding = Math.max(a, maxEnding + a);
            maxSlice = Math.max(maxSlice, maxEnding);
        }

		return maxSlice;
	}
}
