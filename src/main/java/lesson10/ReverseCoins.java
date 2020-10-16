package lesson10;

public class ReverseCoins {

	public int solution(int n) {
        int countTails = 0;
        int[] coins = new int[n + 1];

        for (int person = 1; person < n + 1; person++) {
            int turn = person;
            while (turn <= n) {
                coins[turn] = (coins[turn] + 1) % 2;
                turn += person;
            }
            countTails += coins[person];            
        }

		return countTails;
	}
}
