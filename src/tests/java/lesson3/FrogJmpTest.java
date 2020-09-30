package lesson3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FrogJmpTest {
    
    /**
     * Example test
     */
    @Test
    public void firstTest(){
        // Input
        FrogJmp fj = new FrogJmp();
        int X = 10;
        int Y = 85;
        int D = 30;

        // Output
        int actual = fj.solution(X, Y, D);
        int expected = 3;
        assertEquals(expected, actual);
    }

    /**
     * X = Y
     */
    @Test
    public void secondTest(){
        // Input
        FrogJmp fj = new FrogJmp();
        int X = 10;
        int Y = 10;
        int D = 30;

        // Output
        int actual = fj.solution(X, Y, D);
        int expected = 0;
        assertEquals(expected, actual);
    }
    /**
     * 
     */
    @Test
    public void thirdTest(){
        // Input
        FrogJmp fj = new FrogJmp();
        int X = 1;
        int Y = 5;
        int D = 2;

        // Output
        int actual = fj.solution(X, Y, D);
        int expected = 2;
        assertEquals(expected, actual);
    }

    /**
     * Y < D
     */
    @Test
    public void fourthTest(){
        // Input
        FrogJmp fj = new FrogJmp();
        int X = 1;
        int Y = 3;
        int D = 5;

        // Output
        int actual = fj.solution(X, Y, D);
        int expected = 1;
        assertEquals(expected, actual);
    }

    /**
     * No jump needed
     */
    @Test
    public void fithTest(){
        // Input
        FrogJmp fj = new FrogJmp();
        int X = 1;
        int Y = 1;
        int D = 5;

        // Output
        int actual = fj.solution(X, Y, D);
        int expected = 0;
        assertEquals(expected, actual);
    }
}