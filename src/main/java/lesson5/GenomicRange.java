package lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GenomicRange {
	/**
	 * Slow solution with time complexity of O(M * N)
	 * @param s
	 * @param p
	 * @param q
	 * @return
	 */
	public int[] slow_solution(String S, int[] P, int[] Q) {	
		int M = P.length;
		int[] minImpact = new int[M];

		// Init Dictionary
		Map<Character,Integer> dictionary = initDictionary();
		
		for (int i = 0; i < M; i++) {
			int impact = Integer.MAX_VALUE;
			for (int j = P[i]; j <= Q[i]; j++) {
				int check = dictionary.get(S.charAt(j));
				if(check < impact) impact = check;
			}
			minImpact[i] = impact;
		}
        return minImpact;
	}

	/**
	 * Faster solution O(N + M)
	 * @param S
	 * @param P
	 * @param Q
	 * @return
	 */
	public int[] solution(String S, int[] P, int[] Q) {	
		int N = S.length();
		int M = P.length;
        int[] A = new int[N + 1];
        int[] C = new int[N + 1];
        int[] G = new int[N + 1];
        int[] minImpact = new int[M];
        
        for(int i = 1; i < N + 1; i++) {
    		String s = String.valueOf(S.charAt(i -1));
    		A[i] = A[i - 1];
    		C[i] = C[i - 1];
    		G[i] = G[i - 1];
    		
    		switch (s) {
    		    case "A":
    		        A[i] ++;
    		        break;
    		    case "C":
    		        C[i] ++;
    		        break;
    		    case "G":
    		        G[i] ++;
    		        break;
    		}
	    }
	    
	    for (int i = 0; i < M; i++ ){
            int a_diff = A[Q[i] + 1] - A[P[i]];
            int c_diff = C[Q[i] + 1] - C[P[i]];
            int g_diff = G[Q[i] + 1] - G[P[i]];

    		if ( a_diff > 0) {
    			minImpact[i] = 1;
    		} else if ( c_diff > 0) {
    			minImpact[i] = 2;
    		} else if ( g_diff > 0) {
    			minImpact[i] = 3;
    		} else {
    			minImpact[i] = 4;
    		}
	    }
  
        return minImpact;
	}

	/**
	 * Another slow solution O(N * M)
	 * @param S
	 * @param P
	 * @param Q
	 * @return
	 */
	public int[] slow2_solution(String S, int[] P, int[] Q) {	
		int M = P.length;
		int[] minImpact = new int[M];

		// Init Dictionary
		Map<Character,Integer> dictionary = initDictionary();

		for (int i = 0; i < M; i++) {
			for (char j : dictionary.keySet()) {
				String smaller = S.substring(P[i], Q[i] + 1);
				if(smaller.contains(Character.toString(j))) {
					minImpact[i] = dictionary.get(j);
					break;
				}
			}
		}
		return minImpact;
	}

	private Map<Character, Integer> initDictionary() {
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		map.put('A',1);
		map.put('C',2);
		map.put('G',3);
		map.put('T',4);

		return map;
	}
}