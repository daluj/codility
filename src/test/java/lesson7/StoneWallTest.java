package lesson7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StoneWallTest {
    @Test
    public void exampleTest(){
        // Input
        StoneWall sw = new StoneWall();
        int[] H = {8,8,5,7,9,8,7,4,8};

        // Output
        int actual = sw.solution(H);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void example2Test(){
        // Input
        StoneWall sw = new StoneWall();
        int[] H = {4,5,7,7,8,8,8,8,9};

        // Output
        int actual = sw.solution(H);
        int expected = 5;
        assertEquals(expected, actual);
    }
}