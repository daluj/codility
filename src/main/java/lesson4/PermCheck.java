package lesson4;

import java.util.HashMap;
import java.util.Map;

public class PermCheck {
	public int solution(int[] A) {
		int permutation = 0;
		int N = A.length;

		Map<Integer,Integer> map = initMap(N);

		for (int i = 0; i < N; i++) {
			if(map.containsKey(A[i])) map.remove(A[i]);
		}

		if(map.isEmpty()) permutation = 1;
		
		return permutation;
	}

	private Map<Integer, Integer> initMap(int N) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 1; i <= N; i++) {
			map.put(i, 1);
		}

		return map;
	}
}