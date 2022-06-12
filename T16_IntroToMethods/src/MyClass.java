
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myFirstMethod("hiiii");
		System.out.println(Add(3, 5, 9));
	}
	
	public static void myFirstMethod(String i) {
		System.out.println(i);
	}

	public static int Add(int a, int b, int c) {
		return (a + b + c);
	}
}
