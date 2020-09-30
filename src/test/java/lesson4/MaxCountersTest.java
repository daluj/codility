package lesson4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MaxCountersTest {
    /**
     * Example test
     */
    @Test
    public void firstTest(){
        // Input
        MaxCounters mc = new MaxCounters();
        int N = 5;
        int[] A = {3,4,4,6,1,4,4};

        // Output
        int[] actual = mc.solution(N,A);
        int[] expected = {3,2,2,4,2};

        assertArrayEquals(expected, actual);
    }

    /**
     * Example test
     */
    @Test
    public void secondTest(){
        // Input
        MaxCounters mc = new MaxCounters();
        int N = 5;
        int[] A = {3,4,4,6,1,4,6};

        // Output
        int[] actual = mc.solution(N,A);
        int[] expected = {3,3,3,3,3};

        assertArrayEquals(expected, actual);
    }
}
