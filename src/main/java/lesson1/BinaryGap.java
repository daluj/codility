package lesson1;

public class BinaryGap {
    
    public int solution(int N) {
        int max = 0;
        int count = 0;
        
        while (N % 2 == 0) { 
            N >>= 1;
        }
        
        while (N > 0) {
            if ( (N & 1) == 1) {
                if (count > max) {
                    max = count; 
                }
                count = 0;
            }
            else {
                count++;
            }
            
            N >>= 1;
        }
        
        return max;
    }
    
}
