package lesson6;

import java.util.Arrays;

public class NumberDiscIntersections {

    /**
     * Time complexity O(N)
     * @param A
     * @return
     */
	public int solution(int[] A) {
        int discIntersections = 0;
        int MAX_INTERSECTIONS = 10000000;

        int N = A.length;
        int[] start = new int[N];
        int[] end = new int[N];
        
        // Create array of pairs
        for(int i = 0; i < N; i++){
            int max = Math.max(0, i - A[i]); 
            start[max]++;

            int min = 0;
            if (A[i] >= Integer.MAX_VALUE) min = N -1;
            else min = Math.min(N - 1, i + A[i]);
        
            end[min]++; 
        }

        // Count the segments
        int j = 0;
        for(int i = 0; i < N; i++){
            discIntersections += j * start[i] + (start[i] * (start[i] - 1)) / 2;
            if(discIntersections > MAX_INTERSECTIONS) {
                discIntersections = -1;
                break;
            }
            j += start[i] - end[i]; 
        }
        
		return discIntersections;
    }
    
    /**
     * Time complexity O(N log N)
     * @param A
     * @return
     */
    public int solution_b(int[] A) {
        int N = A.length;
        int[] low = new int[N];
        int[] up = new int[N];
        int discIntersections = 0;
        
        // Create array with the pairs of points
        for(int i = 0; i < N; i++){
            low[i] = i - A[i]; 

            if (A[i] >= Integer.MAX_VALUE) up[i] = A[i];
            else up[i] = i + A[i];  
        }

        Arrays.sort(low);
        Arrays.sort(up);
        
        int j = 0;
        for(int i = 0; i < N; i++){
            while( j < N && up[i] >= low[j]){
                discIntersections-=i; 
                discIntersections+=j;
                j++;
            }
        }
        if(discIntersections > 10000000) discIntersections = -1;
        
        return discIntersections; 
    }

}
