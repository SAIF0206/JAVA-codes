package StringAlgo;

import java.util.*;

public class Reverseapproach2 {
	//Make use of generic class collection
	
	public static String rev(String str) {
		String[] words = str.trim().split(" ");
		Collections.reverse(Arrays.asList(words));
		return String.join(" ", words);
	}
	public static void main(String[] args) {
		String reversed = rev("Trees Are Beautiful");
		System.out.println("'"+ reversed + "'");
	}

}
