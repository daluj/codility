package lesson3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PermMissingElemTest {
    @Test
    public void firstTest(){
        // Input
        PermMissingElem pme = new PermMissingElem();
        int[] A = {2,3,1,5};

        // Output
        int actual = pme.solution(A);
        int expected = 4;

        assertEquals(expected, actual);
    }
}
