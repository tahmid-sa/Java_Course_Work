
public class MyClass {
	// N! = N * (N-1) * (N-2) * 1
	
	public static int factorial(int n) {
		int ret = n;
		
		if (n <= 1) {
			return 1;
		}
		else if (n > 1) {
			ret *= factorial(n - 1);
		}
		
		return ret;
	}
	
	public static void main(String args[]) {
		int a = 4;
		
		System.out.println(factorial(a));
	}
}
