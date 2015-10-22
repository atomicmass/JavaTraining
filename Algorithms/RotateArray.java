public class RotateArray {
	
	public static void main(String ... args) {
		if(args.length < 2) {
			System.out.println("Need 2 args");
			return;
		}
		
		int length = new Integer(args[0]);
		int steps = new Integer(args[1]);
		
		int[] arr = createArray(length);
		rotateArray(arr, steps);
		
		System.out.print("[");
		for(int i=0; i <length; i++) {
			System.out.print(arr[i]);
			if(i < length-1)
				System.out.print(";");
		}
		System.out.println("]");
	}
	
	private static int[] createArray(int length) {
		int[] ret = new int[length];
		for(int i=0; i<length; i++) {
			ret[i] = i;
		}
		
		return ret;
	}
	
	
	//1 2 3 4 5 6 7
	//5 6 7 1 2 3 4 
	private static void rotateArray(int[] arr, int steps) {
		for(int s = 0; s < steps; s++) {
			int temp = arr[arr.length-1];
			for(int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
		}
	}
	
}