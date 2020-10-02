package google_challenge.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void firstTest(){
        // Input
        Solution s = new Solution();
        String input = "abcabcabcabc";

        // Output
        int actual = s.solution(input);
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void secondTest(){
        // Input
        Solution s = new Solution();
        String input = "abccbaabccba";

        // Output
        int actual = s.solution(input);
        int expected = 2;
        assertEquals(expected, actual);
    }
}
