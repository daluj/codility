package lesson5;

public class CountDiv {
	/**
	 * Slow solution with time complexity of O(n)
	 * 
	 * @param A
	 * @param B
	 * @param K
	 * @return
	 */
	public int slow_solution(int A, int B, int K) {
		int count = 0;
		int N = (B - A) + 1;

		for (int i = 0; i < N; i++) {
			int check = A + i;
			if( (check % K) == 0) count++;
		}
		
		return count;
	}

	/**
	 * Fast solution with time complexity of O(1)
	 * @param A
	 * @param B
	 * @param K
	 * @return
	 */
	public int solution(int A, int B, int K) {		
		int count = 0;
		
		if(A % K == 0) count++;
        
        int divB = B/K;
        int divA = A/K;
		
        return divB - divA + count;
	}
}