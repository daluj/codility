package lesson3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TapeEquilibriumTest {
    @Test
    public void firstTest(){
        // Input
        TapeEquilibrium te = new TapeEquilibrium();
        int[] A = {3,1,2,4,3};

        // Output
        int expected = 1;
        int actual = te.solution(A);
        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        // Input
        TapeEquilibrium te = new TapeEquilibrium();
        int[] A = {-3,1,2,-4,3};

        // Output
        int expected = 1;
        int actual = te.solution(A);
        assertEquals(expected, actual);
    }

    @Test
    public void thirdTest(){
        // Input
        TapeEquilibrium te = new TapeEquilibrium();
        int[] A = {1,1};

        // Output
        int expected = 0;
        int actual = te.solution(A);
        assertEquals(expected, actual);
    }

    @Test
    public void fourthTest(){
        // Input
        TapeEquilibrium te = new TapeEquilibrium();
        int[] A = {-1,1};

        // Output
        int expected = 2;
        int actual = te.solution(A);
        assertEquals(expected, actual);
    }
}
