package lesson6;

import java.util.HashMap;
import java.util.Map;

public class Distinct {

	public int solution(int[] A) {
        int N = A.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i < N; i++) {
            map.put(A[i], 1);
        }

        int count  = map.size();

		return count;
	}

}
