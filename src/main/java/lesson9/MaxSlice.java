package lesson9;

public class MaxSlice {

    /**
     * Find largest sum. O(N) complexity
     * For each position, we compute the largest sum that ends in that position. 
     * @param A
     * @return
     */
	public int solution(int[] A) {
        int maxSlice = 0;
        int maxEnding = 0;

        for (int a : A) {
            maxEnding = Math.max(0, maxEnding + a);
            maxSlice = Math.max(maxSlice, maxEnding);
        }

		return maxSlice;
	}
}
