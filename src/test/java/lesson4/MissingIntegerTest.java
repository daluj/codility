package lesson4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MissingIntegerTest {
    @Test
    public void firstTest(){
        // Input
        MissingInteger mi = new MissingInteger();
        int[] A = {1,3,6,4,1,2};

        // Output
        int actual = mi.solution(A);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        // Input
        MissingInteger mi = new MissingInteger();
        int[] A = {1,2,3};

        // Output
        int actual = mi.solution(A);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void thirdTest(){
        // Input
        MissingInteger mi = new MissingInteger();
        int[] A = {-1,-3};

        // Output
        int actual = mi.solution(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void fourthTest(){
        // Input
        MissingInteger mi = new MissingInteger();
        int[] A = {-1,-3,4,2};

        // Output
        int actual = mi.solution(A);
        int expected = 1;
        assertEquals(expected, actual);
    }
}
