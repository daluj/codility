package lesson9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxSliceTest {
    @Test
    public void exampleTest(){
        // Input
        MaxSlice ms = new MaxSlice();
        int[] input = {5,-7,3,5,-2,4,-1};

        // Output
        int actual = ms.solution(input);
        int expected = 10;
        assertEquals(expected, actual);
    }
}