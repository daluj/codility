package lesson2;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int N = A.length;
        int output = 0;
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for (int i = 0; i < N; i++) {
            if(hm.containsKey(A[i])) {
                hm.remove(A[i]);
            }
            else {
                hm.put(A[i], 1);
            }
        }

        for (int key : hm.keySet()) {
            output = key;
        }

        return output;
    }
}
