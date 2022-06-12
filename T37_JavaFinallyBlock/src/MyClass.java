
public class MyClass {
	
	public static int retInt() {
		int a = 100;
		
		try {
			a = a / 0;
			
			return a;
		} catch (ArithmeticException e) {
			System.out.println(e);
			
			return a;
		} finally {
			a = 5000;
			
			System.out.println("Finally called");
			return a;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(retInt());
	}

}
