package lesson4;

import java.util.*;

public class FrogRiverOne {

	public int solution(int X, int[] A) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int N = A.length;
		int earliestTime = -1;

		for(int i = 1; i <= X; i++){
			map.put(i, 1);
		}

		for(int K = 0; K < N; K++){
			if(map.containsKey(A[K])) {
				map.remove(A[K]);
			}
			if (map.isEmpty()) {
				earliestTime = K;
				break;
			}
		}

		return earliestTime;
	}
    
}
