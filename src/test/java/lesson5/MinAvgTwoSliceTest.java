package lesson5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinAvgTwoSliceTest {
    @Test
    public void firstTest(){
        // Input
        MinAvgTwoSlice ma = new MinAvgTwoSlice();
        int[] A = {4,2,2,5,1,5,8};
        
        // Output
        int actual = ma.solution(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        // Input
        MinAvgTwoSlice ma = new MinAvgTwoSlice();
        int[] A = {-3,-5,-8,-4,-10};
        
        // Output
        int actual = ma.solution(A);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void thirdTest(){
        // Input
        MinAvgTwoSlice ma = new MinAvgTwoSlice();
        int[] A = {1,2,5,8,-9,-8,-4,-10};
        
        // Output
        int actual = ma.solution(A);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void twoelementsTest(){
        // Input
        MinAvgTwoSlice ma = new MinAvgTwoSlice();
        int[] A = {1,2};
        
        // Output
        int actual = ma.solution(A);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void negativeNumbersTest(){
        // Input
        MinAvgTwoSlice ma = new MinAvgTwoSlice();
        int[] A = {-1,2,5,-20,8,-4};
        
        // Output
        int actual = ma.solution(A);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void allnegativeNumbersTest(){
        // Input
        MinAvgTwoSlice ma = new MinAvgTwoSlice();
        int[] A = {-1,-2,-5,-20,-8,-4};
        
        // Output
        int actual = ma.solution(A);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
