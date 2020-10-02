package google_challenge.level1;
public class Solution {
	public int solution(String x) {
		int length = x.length();
		int output = 0;
		int i = length;
		
		while (i > 0) {
			int N = length / i;
			boolean valid = false;
			if (N * i == length) {
				valid = true;
				String part = x.substring(0, N);
				int j = 1;
				while (j < i) {
					if (! (x.substring(j * N, j * N + N).equals(part)) ) {
						valid = false;
						break;
					}
					j++;
				}
			}
			if (valid) {
				output = i;
				break;
			}
			i--;
		}

		return output;
	}
    
}
