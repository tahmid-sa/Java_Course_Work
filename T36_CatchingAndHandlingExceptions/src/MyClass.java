
public class MyClass {
	public static void main(String[] args) {
		int b[] = new int[2];
		
		try {
			//int a = 100 / 0;
			
			System.out.println("value of b[3]: " + b[3]);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("---------------------------------------");
	}
}
