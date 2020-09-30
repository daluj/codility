package lesson4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FrogRiverOneTest {
    /**
     * Frog cross
     */
    @Test
    public void firstTest(){
        // Input
        FrogRiverOne fro = new FrogRiverOne();
        int X = 5;
        int[] A = {1,3,1,4,2,3,5,4};

        // Output
        int actual = fro.solution(X,A);
        int expected = 6;

        assertEquals(expected, actual);
    }

    /**
     * Frog doesn't cross
     */
    @Test
    public void secondTest(){
        // Input
        FrogRiverOne fro = new FrogRiverOne();
        int X = 6;
        int[] A = {1,3,1,4,2,3,5,4};

        // Output
        int actual = fro.solution(X,A);
        int expected = -1;

        assertEquals(expected, actual);
    }
    @Test
    public void thirdTest(){
        // Input
        FrogRiverOne fro = new FrogRiverOne();
        int X = 1;
        int[] A = {1,3,1,4,2,3,5,4};

        // Output
        int actual = fro.solution(X,A);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void fourthTest(){
        // Input
        FrogRiverOne fro = new FrogRiverOne();
        int X = 3;
        int[] A = {1,3,1,4,2,3,5,4};

        // Output
        int actual = fro.solution(X,A);
        int expected = 4;

        assertEquals(expected, actual);
    }
}
