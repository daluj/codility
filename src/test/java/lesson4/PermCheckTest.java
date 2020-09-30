package lesson4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PermCheckTest {
    @Test
    public void firstTest(){
        // Input
        PermCheck pc = new PermCheck();
        int[] A = {4,1,3,2};

        // Output
        int actual = pc.solution(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        // Input
        PermCheck pc = new PermCheck();
        int[] A = {4,1,3};

        // Output
        int actual = pc.solution(A);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
