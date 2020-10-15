import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void exampleTest(){
        // Input
        Solution s = new Solution();
        int input = 1;
        
        // Output
        int actual = s.solution(input);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void exampleRandomTest(){
        // Input
        Solution s = new Solution();

        int N = 100;
        int origin = 0;
        int bound = 100;
        int[] input = new Random().ints(N,origin,bound).toArray();

        // Output
        int actual = s.solutionArray(input);
        int expected = 1;
        assertEquals(expected, actual);
    }
}
