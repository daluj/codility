package lesson8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DominatorTest {
    @Test
    public void exampleTest(){
        // Input
        Dominator d = new Dominator();
        int[] input = {3,4,3,2,3,-1,3,3};

        // Output
        int actual = d.solution(input);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void noLeaderTest(){
        // Input
        Dominator l = new Dominator();
        int[] input = {6,6,6,8,8,8};

        // Output
        int actual = l.solution(input);
        int expected = -1;
        assertEquals(expected, actual);
    }
}
