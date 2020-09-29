package lesson3;
public class TapeEquilibrium {

	public int solution(int[] A) {
        int N = A.length;
        int diff = Integer.MAX_VALUE;   
        int total_sum = 0; 
        int P = N - 1;  
        
        for (int i = 0; i < N; i++) {
            total_sum += A[i];
        }

        int sum = 0;
        for (int i = 0; i < P; i++) {
            sum += A[i];
            int res = total_sum - sum;
            if( Math.abs(res - sum) < diff ) {
                diff = Math.abs(res - sum);
            }
        }

		return diff;
	}
    
}
