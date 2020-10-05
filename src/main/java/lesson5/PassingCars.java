package lesson5;

public class PassingCars {
    /**
     * Really slow brut force solution O(N * N)
     * @param A
     * @return
     */
    public int slow_solution(int[] A) {
        int N = A.length;
        int passingCars = 0;
        int maxCount = 1000000000;

        for (int P = 0; P < N; P++) {
            for (int Q = P + 1; Q < N; Q++) {
                if(A[P] == 0 && A[Q] == 1) passingCars++;
            }    
        }

        if(passingCars == maxCount) return -1;

        return passingCars;
    }

    /**
     * Fastest solution O(N)
     * @param A
     * @return
     */
    public int solution(int[] A) {
        int N = A.length;
        int maxCount = 1000000000;
        int passingCars = 0;
        int countCeros = 0;

        for (int i = 0; i < N; i++) {
            if(A[i] == 0) countCeros++;
            else if(A[i] == 1) passingCars += countCeros;

            // Stop the loop when we reach maxCount
            if(passingCars > maxCount) {
                passingCars = -1;
                break;
            }
        }

        return passingCars;
    }
}
