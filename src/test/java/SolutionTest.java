import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
