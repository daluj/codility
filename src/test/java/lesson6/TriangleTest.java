package lesson6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    
    @Test
    public void firstTest(){
        // Input
        Triangle t = new Triangle();
        int[] A = {10,2,5,1,8,20};

        // Output
        int actual = t.solution(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        // Input
        Triangle t = new Triangle();
        int[] A = {10,50,5,1};

        // Output
        int actual = t.solution(A);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
