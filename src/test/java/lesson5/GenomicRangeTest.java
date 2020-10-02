package lesson5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class GenomicRangeTest {
    @Test
    public void firstTest(){
        // Input
        GenomicRange gr = new GenomicRange();
        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};

        // Output
        int[] actual = gr.solution(S,P,Q);
        int[] expected = {2,4,1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        // Input
        GenomicRange gr = new GenomicRange();
        String S = "GT";
        int[] P = {0,0,1};
        int[] Q = {0,1,1};

        // Output
        int[] actual = gr.solution(S,P,Q);
        int[] expected = {3,3,4};
        assertArrayEquals(expected, actual);
    }
}
