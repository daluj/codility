package lesson4;

public class MaxCounters {

	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int max = 0;
		int count = 0;
		int length = A.length;

		for (int i = 0; i < length; i++) {
			int X = A[i];
			if( X == (N + 1)) {
				count = max;
				continue;
			}

			if(counters[X - 1] < count) counters[X - 1] = count;

			counters[X - 1]++;

			if(max < counters[X - 1]) max = counters[X - 1];
		}

		for (int i = 0; i < N; i++) {
			if(counters[i] < count) counters[i] = count;
		}
		
		return counters;
	}
}
