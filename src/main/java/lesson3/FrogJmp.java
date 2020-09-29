package lesson3;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int jumps;

        double diff = Y - X;
        jumps = (int) Math.ceil( diff / D );

        return jumps;
    }
}