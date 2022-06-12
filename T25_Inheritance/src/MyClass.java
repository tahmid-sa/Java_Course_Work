
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.set_values(24, 35);
		tri.set_values(50, 2);
		
		System.out.println(rec.area());
		System.out.println(tri.area());
	}

}
