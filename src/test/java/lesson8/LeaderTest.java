package lesson8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LeaderTest {
    @Test
    public void exampleTest(){
        // Input
        Leader l = new Leader();
        int[] input = {6,8,4,6,8,6,6};

        // Output
        int actual = l.solution(input);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void noLeaderTest(){
        // Input
        Leader l = new Leader();
        int[] input = {6,6,6,8,8,8};

        // Output
        int actual = l.solution(input);
        int expected = -1;
        assertEquals(expected, actual);
    }
}
