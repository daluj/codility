package lesson7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FishTest {
    @Test
    public void exampleTest(){
        // Input
        Fish f = new Fish();
        int[] A = {4,3,2,1,5};
        int[] B = {0,1,0,0,0};

        // Output
        int actual = f.solution(A,B);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void justOneFishTest(){
        // Input
        Fish f = new Fish();
        int[] A = {0};
        int[] B = {0};

        // Output
        int actual = f.solution(A,B);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void allSameDirectionTest(){
        // Input
        Fish f = new Fish();
        int[] A = {1,4,3,5,2};
        int[] B = {1,1,1,1,1};

        // Output
        int actual = f.solution(A,B);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void example2Test(){
        // Input
        Fish f = new Fish();
        int[] A = {1,4,3,5,2};
        int[] B = {0,1,0,1,0};

        // Output
        int actual = f.solution(A,B);
        int expected = 3;
        assertEquals(expected, actual);
    }

    /**
     * The last fish eats all
     */
    @Test
    public void lastFishEatsAllTest(){
        // Input
        Fish f = new Fish();
        int[] A = {1,4,3,2,5};
        int[] B = {1,1,1,1,0};

        // Output
        int actual = f.solution(A,B);
        int expected = 1;
        assertEquals(expected, actual);
    }

    /**
     * The last fish eats all
     */
    @Test
    public void example3Test(){
        // Input
        Fish f = new Fish();
        int[] A = {1,4,3,2,5};
        int[] B = {1,1,0,1,0};

        // Output
        int actual = f.solution(A,B);
        int expected = 1;
        assertEquals(expected, actual);
    }
}
