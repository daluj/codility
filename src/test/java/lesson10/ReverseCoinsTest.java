package lesson10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseCoinsTest {
    @Test
    public void exampleTest(){
        // Input
        ReverseCoins s = new ReverseCoins();
        int input = 10;
        
        // Output
        int actual = s.solution(input);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
