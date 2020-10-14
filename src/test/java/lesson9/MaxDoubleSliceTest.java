package lesson9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxDoubleSliceTest {
    @Test
    public void exampleTest(){
        // Input
        MaxDoubleSlice mds = new MaxDoubleSlice();
        int[] input = {3,2,6,-1,4,5,-1,2};

        // Output
        int actual = mds.solution(input);
        int expected = 17;
        assertEquals(expected, actual);
    }

    @Test
    public void example1Test(){
        // Input
        MaxDoubleSlice mds = new MaxDoubleSlice();
        int[] input = {5,-7,3,5,-2,4,-1};

        // Output
        int actual = mds.solution(input);
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void example2Test(){
        // Input
        MaxDoubleSlice mds = new MaxDoubleSlice();
        int[] input = {-3,2,6,-1,4,5,-1,2};

        // Output
        int actual = mds.solution(input);
        int expected = 17;
        assertEquals(expected, actual);
    }

    @Test
    public void example3Test(){
        // Input
        MaxDoubleSlice mds = new MaxDoubleSlice();
        int[] input = {3,2,6,8,4,5,7,2};

        // Output
        int actual = mds.solution(input);
        int expected = 30;
        assertEquals(expected, actual);
    }
    @Test
    public void example4Test(){
        // Input
        MaxDoubleSlice mds = new MaxDoubleSlice();
        int[] input = {-3,-2,-6,-8,-4,-5,-7,-2};

        // Output
        int actual = mds.solution(input);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void example5Test(){
        // Input
        MaxDoubleSlice mds = new MaxDoubleSlice();
        int[] input = {-3,2,6,-1,4,5,-1,2,8,-9};

        // Output
        int actual = mds.solution(input);
        int expected = 26;
        assertEquals(expected, actual);
    }
    @Test
    public void example6Test(){
        // Input
        MaxDoubleSlice mds = new MaxDoubleSlice();
        int[] input = {-3,2,6,-20,4,5,-20,2,8,-9};

        // Output
        int actual = mds.solution(input);
        int expected = 19;
        assertEquals(expected, actual);
    }
}