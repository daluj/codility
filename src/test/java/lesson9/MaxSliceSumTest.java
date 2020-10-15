package lesson9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxSliceSumTest {
    @Test
    public void exampleTest(){
        // Input
        MaxSliceSum mss = new MaxSliceSum();
        int[] input = {5,-7,3,5,-2,4,-1};

        // Output
        int actual = mss.solution(input);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void example1Test(){
        // Input
        MaxSliceSum mss = new MaxSliceSum();
        int[] input = {-10};

        // Output
        int actual = mss.solution(input);
        int expected = -10;
        assertEquals(expected, actual);
    }

    @Test
    public void example2Test(){
        // Input
        MaxSliceSum mss = new MaxSliceSum();
        int[] input = {3,2,-6,4,0};

        // Output
        int actual = mss.solution(input);
        int expected = 5;
        assertEquals(expected, actual);
    }
}