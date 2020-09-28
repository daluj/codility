package lesson2;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int N = A.length;

        if(N <= 1) return A;

        int[] output = new int[N];

        for (int i = 0; i < N; i++) {
            int j = i + K;
            int mod = j % N;
            if (j / N >= 1) {
                output[mod] = A[i];    
            }
            else {
                output[j] = A[i];
            }
        }

        return output;
    }
}
