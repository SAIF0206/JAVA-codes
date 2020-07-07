package StringAlgo;

public class MostRepeating {
	
	public static char getMaxOccuringChar(String str) {
		if(str.isEmpty() || str == null)
			throw new IllegalArgumentException();
		final int ASCII_SIZE = 256;
		int[] frequency = new int[ASCII_SIZE];
		for(char ch : str.toCharArray()) {
			frequency[ch]++;
		}
		
		int max = 0;
		char result = ' ';
		for(int i = 0; i<frequency.length; i++) {
			if(frequency[i] > max) {
				max = frequency[i];
				result = (char)i;
			}
		}
		System.out.println(max);
		return result;
	}
	
	public static void main(String[] args) {
		char result = getMaxOccuringChar("");
		System.out.println(result);
	}
}
