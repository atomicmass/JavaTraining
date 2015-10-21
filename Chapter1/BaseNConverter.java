import java.util.Scanner;
import java.lang.Math;
import java.lang.StringBuilder;

public class BaseNConverter {
	private static final char[] SYMBOLS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'};

	public static void main(String ... args) {
		if(args.length != 2) {
			System.out.println("Expected 2 arguments");
			return;
		}
		
		Integer value = new Integer(args[0]);
		Integer base = new Integer(args[1]);
		
		System.out.println("Converting " + value.toString() + " to base " + base.toString());
		
		System.out.println(intToBase(value, base));
	}
	
	public static String intToBase(final int value, final int toBase) {
		int remainder = value;
		StringBuilder converted = new StringBuilder();
		for(int pos = 20; pos >= 0; pos--) {
			double posValue = Math.pow(toBase, pos); 
			boolean found = false;
			for(int base = toBase-1; base > 0; base--) {
				if(base * posValue <= remainder) {
					remainder -= base * posValue;
					converted.append(SYMBOLS[base]);
					found = true;
					break;
				}
			}
			if(!found) {
				converted.append(SYMBOLS[0]);
			}
		}
		
		return converted.toString();
	}
}