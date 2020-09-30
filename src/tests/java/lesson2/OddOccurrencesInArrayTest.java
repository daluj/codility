package lesson2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OddOccurrencesInArrayTest {

    @Test
    public void firstTest(){
        
        int[] A = {9,3,9,3,9,7,9};
        OddOccurrencesInArray oddOArray = new OddOccurrencesInArray();
        int actual = oddOArray.solution(A);
        int expected = 7;

        assertEquals(expected, actual);
    }
}
