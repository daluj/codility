package lesson7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NestingTest {
    @Test
    public void exampleTest(){
        // Input
        Nesting n = new Nesting();
        String S = "(()(())())";

        // Output
        int actual = n.solution(S);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void example2Test(){
        // Input
        Nesting n = new Nesting();
        String S = "())";

        // Output
        int actual = n.solution(S);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void example3Test(){
        // Input
        Nesting n = new Nesting();
        String S = ")(";

        // Output
        int actual = n.solution(S);
        int expected = 0;
        assertEquals(expected, actual);
    }
}