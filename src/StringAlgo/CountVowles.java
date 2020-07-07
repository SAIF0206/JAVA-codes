package StringAlgo;

public class CountVowles {
	
	//Program to count number of Vowles
	public static int vowles(String str) {
		if(str == null) {
			return 0;
		}
		int count = 0;
		String s2 = "aeiou";
		for(char ch : str.toLowerCase().toCharArray()) {
			System.out.println(s2.indexOf(ch));
			if(s2.indexOf(ch) != -1) {
				
				count++;
			}
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		int count = vowles("Hello World");
		System.out.println(count);
	}

}
