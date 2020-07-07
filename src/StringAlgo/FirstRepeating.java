package StringAlgo;

import java.util.*;

public class FirstRepeating {

	//using set to store only keys
	public static char removeDup(String str) {
		if(str == null) {
			return '\0';
		}
		Set<Character> seen = new HashSet<>();
		//StringBuilder output = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(seen.contains(ch)) {
				return ch;
			}
			else {
				seen.add(ch);
			}
		}
		return '\0';
		
	}
	public static void main(String[] args) {
		System.out.println(removeDup("ABBCCCD"));
	}
}
