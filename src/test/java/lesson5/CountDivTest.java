package lesson5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountDivTest {
    @Test
    public void firstTest(){
        // Input
        CountDiv cd = new CountDiv();
        int A = 6;
        int B = 11;
        int K = 2;

        // Output
        int actual = cd.solution(A,B,K);
        int expected = 3;
        assertEquals(expected, actual);
    }

    /**
     * Big integers
     */
    @Test
    public void smallAbigBTest(){
        // Input
        CountDiv cd = new CountDiv();
        int A = 6;
        int B = 11000000;
        int K = 2;

        // Output
        int actual = cd.solution(A,B,K);
        int expected = 5499998;
        assertEquals(expected, actual);
    }

    /**
     * No number divisible by K
     */
    @Test
    public void notDivisibleTest(){
        // Input
        CountDiv cd = new CountDiv();
        int A = 6;
        int B = 11;
        int K = 12;

        // Output
        int actual = cd.solution(A,B,K);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void KequalsBTest(){
        // Input
        CountDiv cd = new CountDiv();
        int A = 1;
        int B = 2;
        int K = 2;

        // Output
        int actual = cd.solution(A,B,K);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void KequalsATest(){
        // Input
        CountDiv cd = new CountDiv();
        int A = 1;
        int B = 2;
        int K = 1;

        // Output
        int actual = cd.solution(A,B,K);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void ceroAandBTest(){
        // Input
        CountDiv cd = new CountDiv();
        int A = 0;
        int B = 0;
        int K = 11;

        // Output
        int actual = cd.solution(A,B,K);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void AequalsBdivisibleTest(){
        // Input
        CountDiv cd = new CountDiv();
        int A = 10;
        int B = 10;
        int K = 5;

        // Output
        int actual = cd.solution(A,B,K);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        // Input
        CountDiv cd = new CountDiv();
        int A = 11;
        int B = 345;
        int K = 17;

        // Output
        int actual = cd.solution(A,B,K);
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    public void thirdTest(){
        // Input
        CountDiv cd = new CountDiv();
        int A = 1;
        int B = 1;
        int K = 11;

        // Output
        int actual = cd.solution(A,B,K);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void fourthTest(){
        // Input
        CountDiv cd = new CountDiv();
        int A = 10;
        int B = 10;
        int K = 20;

        // Output
        int actual = cd.solution(A,B,K);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
