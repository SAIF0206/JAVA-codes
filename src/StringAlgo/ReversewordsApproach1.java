package StringAlgo;

public class ReversewordsApproach1 {
	
	//Using Normal loop method
	public static String reverse(String str) {
		if(str == null)
			return "";
		String[] words = str.trim().split(" ");
		StringBuilder reversed  = new StringBuilder();
		for(int i = words.length-1; i >=0; i--) {
			reversed.append(words[i] + " ");
			
		}
		return reversed.toString().trim();
	}
	
	public static void main(String[] args) {
		String reversed = reverse("Trees are beautiful");
		System.out.println("'"+ reversed + "'");
	}

}
