package lesson8;

import java.util.*;

public class Leader {
	public int solution(int[] A) {
		int N = A.length;
		int leader = -1;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		for (int i = 0; i < N; i++) {
			if(!map.containsKey(A[i])){
				map.put(A[i], 1);
			} else {
				int count = map.get(A[i]);
				count++;
				map.put(A[i],count);
			}
		}

		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			int count = entry.getValue();
			if(count > N / 2) leader = entry.getKey();
		}
		
		return leader;
	}
    
}
