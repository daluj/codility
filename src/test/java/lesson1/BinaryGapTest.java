package lesson1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinaryGapTest {
    /**
     * N = odd 
    */
    @Test
    public void oddNumberTest(){
        BinaryGap solution = new BinaryGap();

        int N = 1041;
        int output = solution.solution(N);
        assertEquals(5, output);
    }
    /**
     * N = even
     */    
    @Test
    public void evenNumberTest(){
        BinaryGap solution = new BinaryGap();

        int N = 32;
        int output = solution.solution(N);
        assertEquals(0, output);
    }
    /**
     * N = big int
     */
    @Test
    public void bigIntTest(){
        BinaryGap solution = new BinaryGap();

        int N = 1147463487;
        int output = solution.solution(N);
        assertEquals(3, output);
    }

}
