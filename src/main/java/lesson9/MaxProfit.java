package lesson9;

public class MaxProfit {

    /**
     * Brut force solution O(N * N) complexity. 
     * BCR = O(N) we can't do better than this.
     * Used to build the test cases for the best solution.
     * @param A
     * @return
     */
	public int brutForcesolution(int[] A) {
        int N = A.length;
        int maxProfit = 0;

        for (int P = 0; P < N; P++) {
            for (int Q = 0; Q < N; Q++) {
                if(Q <= P) continue;
                int profit = A[Q] - A[P];
                maxProfit = Math.max(maxProfit, profit);
            }
        }

		return maxProfit;
    }
    
    /**
     * Best solution in O(N) complexity
     * @param A
     * @return
     */
    public int solution(int[] A) {
        int maxProfit = 0;
        int minPrice = 200000; // each element of array A is an integer within the range [0..200,000]

        for (int priceDay : A) {
           minPrice = Math.min(minPrice, priceDay);
           maxProfit = Math.max(maxProfit, priceDay - minPrice);
        }

		return maxProfit;
	}

}
