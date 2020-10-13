package lesson8;

import java.util.*;

public class Dominator {
	public int solution(int[] A) {
		int N = A.length;
		int dominator = -1;

		// Map of ocurrences
		Map<Integer,Integer> mapCount = new HashMap<Integer,Integer>();
		// Map of indexes
		Map<Integer,Integer> mapIndexes = new HashMap<Integer,Integer>();

		for (int i = 0; i < N; i++) {
			if(!mapCount.containsKey(A[i])){
				mapCount.put(A[i], 1);
				mapIndexes.put(A[i], i);
			} else {
				int count = mapCount.get(A[i]);
				count++;
				mapCount.put(A[i],count);
			}
		}

		for (Map.Entry<Integer,Integer> entry : mapCount.entrySet()) {
			int count = entry.getValue();
			if(count > N / 2) dominator = mapIndexes.get(entry.getKey());
		}
		
		return dominator;
	}
    
}
