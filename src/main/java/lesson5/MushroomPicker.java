package lesson5;

public class MushroomPicker {

	public int solution(int[] A, int K, int M) {		
		int maxMushrooms = 0;
		int N = A.length;
		int P[] = prefixSum(A);

		int lengthFirst = Math.min(M, K) + 1;
		for (int i = 0; i < lengthFirst; i++) {
			int leftPos = K - i;
			int b = Math.max(K, K + M - 2 * i);
			int rightPos = Math.min(N - 1 , b);
			maxMushrooms = Math.max(maxMushrooms , countTotal(P,leftPos,rightPos));
		}

		int lengthSecond = Math.min((M + 1) , (N - K));
		for (int i = 0; i < lengthSecond; i++) {
			int rightPos = K + i;
			int b = Math.min(K , K - (M - 2 * i) );
			int leftPos = Math.max(0 , b);
			maxMushrooms = Math.max(maxMushrooms , countTotal(P, leftPos, rightPos));
		}

        return maxMushrooms;
	}

	/**
	 * Function that calculates the total between 2 positions of a prefix array
	 * @param P
	 * @param leftPos
	 * @param rightPos
	 * @return
	 */
	private int countTotal(int[] P, int leftPos, int rightPos) {
		return P[rightPos + 1] - P[leftPos];
	}

	/**
	 * Function that calculates the prefix sum of an array
	 * @param A
	 * @return
	 */
	private int[] prefixSum(int[] A) {
		int N = A.length;
		int[] P = new int[N + 1];

		for (int i = 1; i < N + 1; i++) {
			P[i] = P[i - 1] + A[i - 1];
		}
		return P;
	}
}