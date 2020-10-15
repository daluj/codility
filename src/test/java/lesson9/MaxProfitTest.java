package lesson9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class MaxProfitTest {
    @Test
    public void exampleTest(){
        // Input
        MaxProfit mp = new MaxProfit();
        int[] input = {23171,21011,21123,21366,21013,21367};

        // Output
        int actual = mp.solution(input);
        int expected = 356;
        assertEquals(expected, actual);
    }

    @Test
    public void randomTest(){
        // Input
        MaxProfit mp = new MaxProfit();
        int N = 100;
        int origin = 0;
        int bound = 100;
        int[] input = new Random().ints(N,origin,bound).toArray();

        // Output
        int actual = mp.solution(input);
        int expected = mp.brutForcesolution(input);
        assertEquals(expected, actual);
    }
}