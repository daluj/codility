package lesson4;

import java.util.HashMap;
import java.util.Map;


public class MissingInteger {
	public int solution(int[] A) {
		int missing = 1;
		int N = A.length;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int maxInteger = 1000000;

		for (int i = 0; i < N; i++) {
			if(A[i] > 0 ) map.put(A[i], 1);
		}

		if (map.isEmpty()) return missing;

		for (int i = 1; i <= maxInteger; i++) {
			if(map.containsKey(i)) map.remove(i);
			else {
				missing = i;
				break;
			}

			if(map.isEmpty()) {
				missing = i + 1;
				break;
			}
		}	

		return missing;
	}
    
}