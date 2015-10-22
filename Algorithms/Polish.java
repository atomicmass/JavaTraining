import java.util.Stack;
import java.util.regex.*;
import java.lang.IllegalArgumentException;

public class Polish {
	private static String[] input = {"2", "1", "+", "3", "*", "5", "3", "+", "*"};
	/* ((2+1)*3) * (5+3) 72 */
	
	public static void main(String ... args) {
		System.out.println(calculatePolish(input));
	}
	
	private static double calculatePolish(String[] input) {
		Stack<Double> stack = new Stack<>();
		
		Pattern pattern = Pattern.compile("[*,/,+,-]");
		for(int i=0; i<input.length; i++) {
			if(pattern.matcher(input[i]).matches()) {
				Double op1 = stack.pop();
				Double op2 = stack.pop();
				switch(input[i]) {
					case "*" :
						stack.push(op1 * op2);
						break;
					case "+" :
						stack.push(op1 + op2);
						break;
					case "-" :
						stack.push(op1 - op2);
						break;
					case "/" :
						stack.push(op1 / op2);
						break;
				}
			}
			else 
				stack.push(new Double(input[i]));
		}
		
		if(stack.size() == 1)
			return stack.pop();
		
		throw new IllegalArgumentException("Illegal number of arguments found");
	}
}