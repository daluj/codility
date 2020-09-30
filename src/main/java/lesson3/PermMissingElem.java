package lesson3;

import java.util.*;

public class PermMissingElem {
    public int solution(int[] A) {
        int missing_element = 0;
        int N = A.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for (int i = 1; i <= N + 1; i++) {
            map.put(i, 1);
        }

        for (int i = 0; i < N; i++) {
            if(map.containsKey(A[i])) {
                map.remove(A[i]);
            }
        }

        for (int key : map.keySet()) {
            missing_element = key;
        }

        return missing_element;
    }
}
