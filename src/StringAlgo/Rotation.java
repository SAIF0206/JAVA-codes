package StringAlgo;

public class Rotation {
	
//	ABCD -> DABC
//		 -> CDAB
//		 -> BCDA
//		 -> ABCD
// Concat ABCDABCD and find the sub string inside it
	public static boolean rotation(String str1, String str2) {
		if(str1 == null || str2 == null)
			return false;
		
		return (str1.length() == str2.length() && (str1 + str1).contains(str2));
		
	}
	
	public static void main(String[] args) {
		System.out.println(rotation(" ", null));
	}
}
