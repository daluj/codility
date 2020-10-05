package lesson5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PassingCarsTest {
    @Test
    public void firstTest(){
        // Input
        PassingCars pc = new PassingCars();
        int[] A = {0,1,0,1,1};

        // Output
        int actual = pc.solution(A);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        // Input
        PassingCars pc = new PassingCars();
        int[] A = {0,0};

        // Output
        int actual = pc.solution(A);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void thirdTest(){
        // Input
        PassingCars pc = new PassingCars();
        int[] A = {1,1,1,1};

        // Output
        int actual = pc.solution(A);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
