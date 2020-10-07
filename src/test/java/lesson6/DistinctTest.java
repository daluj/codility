package lesson6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DistinctTest {
    
    @Test
    public void firstTest(){
        // Input
        Distinct d = new Distinct();
        int[] A = {2,1,1,2,3,1};

        // Output
        int actual = d.solution(A);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
