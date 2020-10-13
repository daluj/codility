package lesson8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EquiLeaderTest {
    @Test
    public void exampleTest(){
        // Input
        EquiLeader el = new EquiLeader();
        int[] input = {4,3,4,4,4,2};

        // Output
        int actual = el.solution(input);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void noLeaderTest(){
        // Input
        EquiLeader el = new EquiLeader();
        int[] input = {6,6,6,8,8,8};

        // Output
        int actual = el.solution(input);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void oneElementTest(){
        // Input
        EquiLeader el = new EquiLeader();
        int[] input = {4};

        // Output
        int actual = el.solution(input);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
