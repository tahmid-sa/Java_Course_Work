
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(3, 5));
		System.out.println(Add(3.5, 5.3));
		System.out.println(Add("hii", "hooo"));
	}
	
	public static int Add(int a, int b) {
		return (a + b);
	}

	public static double Add(double a, double b) {
		return (a + b);
	}
	
	public static String Add(String a, String b) {
		return (a + b);
	}
}
