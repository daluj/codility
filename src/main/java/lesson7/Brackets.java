package lesson7;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {

	public int solution(String s) {
        int N = s.length();
        int nested = 0;

        if(s.isEmpty()) return 1;

        // Init map with dictionary
        Map<Character,Character> dictionary = initMap();
        
        // Create the stack
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if (dictionary.containsKey(c)) {
                stack.push(dictionary.get(c));
            }
            else if(c == ')' || c == '}' || c == ']'){
                if (stack.empty()) return 0;
                
                char temp = stack.pop();
                if(temp != c) return 0;
            }
        }

        if(stack.empty()) nested = 1;

		return nested;
	}

    private Map<Character, Character> initMap() {
        Map<Character,Character> map = new HashMap<Character,Character>();
        
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        return map;
    }

}
