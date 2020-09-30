package lesson2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CyclicRotationTest {
    @Test
    public void firstTest(){
        CyclicRotation cr = new CyclicRotation();
        int[] A = {3,8,9,7,6};
        int K = 3;
        int[] actual = cr.solution(A, K);
        int[] expected = {9,7,6,3,8};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        CyclicRotation cr = new CyclicRotation();
        int[] A = {1,2,3,4};
        int K = 4;
        int[] actual = cr.solution(A, K);
        int[] expected = {1,2,3,4};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void thirdTest(){
        CyclicRotation cr = new CyclicRotation();
        int[] A = {0,0,0};
        int K = 1;
        int[] actual = cr.solution(A, K);
        int[] expected = {0,0,0};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void oneElementTest(){
        CyclicRotation cr = new CyclicRotation();
        int[] A = {1};
        int K = 5;
        int[] actual = cr.solution(A, K);
        int[] expected = {1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void KbiggerNTest(){
        CyclicRotation cr = new CyclicRotation();
        int[] A = {1,2,3};
        int K = 5;
        int[] actual = cr.solution(A, K);
        int[] expected = {2,3,1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void bigKTest(){
        CyclicRotation cr = new CyclicRotation();
        int[] A = {1,2,3};
        int K = 100;
        int[] actual = cr.solution(A, K);
        int[] expected = {3,1,2};

        assertArrayEquals(expected, actual);
    }
}
