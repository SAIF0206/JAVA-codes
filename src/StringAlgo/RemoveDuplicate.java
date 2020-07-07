package StringAlgo;

import java.util.*;

public class RemoveDuplicate {

	//using set to store only keys
	public static String removeDup(String str) {
		if(str == null) {
			return "";
		}
		Set<Character> seen = new HashSet<>();
		StringBuilder output = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(!seen.contains(ch)) {
				seen.add(ch);
				output.append(ch);
			}
		}
		return output.toString();
	}
	public static void main(String[] args) {
		System.out.println(removeDup("Heelloo  World"));
	}
}
