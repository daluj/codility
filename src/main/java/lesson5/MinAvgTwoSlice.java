package lesson5;

public class MinAvgTwoSlice {

    /**
     * Really slow brut force solution O(N*N)
     * @param A
     * @return
     */
	public int slow_solution(int[] A) {
        int N = A.length;
        double minAvg = Double.MAX_VALUE;
        int index = -1;
		for (int P = 0; P < N; P++) {
            double sum = A[P];
            for (int Q = P + 1; Q < N; Q++) {
                sum += A[Q];
                double avg = sum / (Q - P + 1);
                if(avg < minAvg){
                    index = P;
                    minAvg = avg;
                }
            }
        }
        
        return index;
    }
    /**
     * Faster solution O(N)
     * @param A
     * @return
     */
    public int solution(int[] A) {
        int N = A.length;
        float minSum = Integer.MAX_VALUE;
        int index = -1;
        
        for (int i = 0; i < N - 1; i++) {
            float sum = 0;

            if (i + 1 < N) {
                sum = (float) ( (A[i] + A[i + 1]) / 2.0) ;
                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            if (i + 2 < N) {
                sum = (float) ( (A[i] + A[i+1] + A[i+2]) / 3.0);
                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }
            
        }

        return index;
    }
}
