package lesson6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxProductThreeTest {
    
    @Test
    public void firstTest(){
        // Input
        MaxProductThree mpt = new MaxProductThree();
        int[] A = {-3,1,2,-2,5,6};

        // Output
        int actual = mpt.solution(A);
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    public void allNegativeTest(){
        // Input
        MaxProductThree mpt = new MaxProductThree();
        int[] A = {-5,-7,-3,-10};

        // Output
        int actual = mpt.solution(A);
        int expected = -105;
        assertEquals(expected, actual);
    }

    @Test
    public void twoNegativeHighestTest(){
        // Input
        MaxProductThree mpt = new MaxProductThree();
        int[] A = {10,-20,5,-30};

        // Output
        int actual = mpt.solution(A);
        int expected = 6000;
        assertEquals(expected, actual);
    }
}
