package lesson6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberDiscIntersectionsTest {
    
    @Test
    public void firstTest(){
        // Input
        NumberDiscIntersections ndi = new NumberDiscIntersections();
        int[] A = {1,5,2,1,4,0};

        // Output
        int actual = ndi.solution(A);
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        // Input
        NumberDiscIntersections ndi = new NumberDiscIntersections();
        int[] A = {1,2147483647,0};

        // Output
        int actual = ndi.solution(A);
        int expected = 2;
        assertEquals(expected, actual);
    }
}
