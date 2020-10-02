package lesson5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MushroomPickerTest {
    @Test
    public void firstTest(){
        // Input
        MushroomPicker mp = new MushroomPicker();
        int[] A = {2,3,7,5,1,3,9};
        int K = 4;
        int M = 6;
        
        // Output
        int actual = mp.solution(A,K,M);
        int expected = 25;
        assertEquals(expected, actual);
    }
}
