import java.util.Hashtable;
import java.lang.Character;

public class Isomorphic {
	public static void main(String... args) {
		if(args.length < 2) {
			System.out.println("Please supply 2 strings");
			return;
		}
		
		System.out.println(isIsomorphic(args[0], args[1]));
	}
	
	public static boolean isIsomorphic(String str1, String str2) {
		if(str1 == null || str2 == null || str1.length() != str2.length())
			return false;
		if(str1.equals(str2))
			return true;
		
		Hashtable<String, String> ht1 = new Hashtable<>();
		Hashtable<String, String> ht2 = new Hashtable<>();
		String mappedStr1 = "";
		String mappedStr2 = "";
		int nextLetter = 65;
		
		for(int i=0; i<str1.length(); i++) {
			String mappedChar = new String(Character.toChars(nextLetter));
			String nextChar1 = str1.substring(i, i+1);
			String nextChar2 = str2.substring(i, i+1);
			
			if(!ht1.containsKey(nextChar1)) {
				if(ht2.containsKey(nextChar2))
					return false;
				ht1.put(nextChar1, mappedChar);
				ht2.put(nextChar2, mappedChar);
				nextLetter++;
			}
			
			mappedStr1 += ht1.get(nextChar1);
			mappedStr2 += ht2.get(nextChar2);
			
			if(!mappedStr1.equals(mappedStr2))
				return false;
		}
		
		
		return true;
	}
}