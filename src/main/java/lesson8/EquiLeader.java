package lesson8;

import java.util.*;

public class EquiLeader {

	/**
	 * O(N) time complexity
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		int equiLeader = 0;
		int leader = -1;
		int leaderCount = 0;
		int N = A.length;

		// Find the leader
		Map<Integer,Integer> map = findLeader(A);
		if(map.isEmpty()) return equiLeader;

		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			leader = entry.getKey();
			leaderCount = entry.getValue();
		}

		int countLeader1 = 0; // How many leaders are there on the first sequence
		int countLeader2 = leaderCount; // How many leaders are there on the second sequence

		for (int i = 0; i < N; i++) {
			if (A[i] == leader) {
				countLeader1++;
				countLeader2--;
			}

			int N1 = i + 1; // Length of the first sequence
			int N2 = N - N1;// Length of the second sequence

			// Check if it meets the condition to be equiLeader
			if( (countLeader1 > N1 / 2) && (countLeader2 > N2 / 2) ) equiLeader++;
		}

		return equiLeader;
	}

	/**
	 * Find the leader of the given array. Time complexity of O(N)
	 * @param A
	 * @return returns a map with the leader as key and the number of times it appears as value
	 */
	private Map<Integer,Integer> findLeader(int[] A) {
		int N = A.length;

		// Map with the number as key and how many times it appears as value
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		// Return map with the leader as key and the number of times it appears as value
		Map<Integer,Integer> mapLeader = new HashMap<Integer,Integer>();

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
			if(count > N / 2) {
				mapLeader.put(entry.getKey(), entry.getValue());
			}
		}
		
		return mapLeader;
	}
}
