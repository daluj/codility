package lesson7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BracketsTest {
    @Test
    public void firstTest(){
        // Input
        Brackets b = new Brackets();
        String input = "{[()()]}";

        // Output
        int actual = b.solution(input);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        // Input
        Brackets b = new Brackets();
        String input = "([)()]";

        // Output
        int actual = b.solution(input);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
