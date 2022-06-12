
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube1 = new Cube();
		
		System.out.println(cube1.getCubeVolume());
		
		Cube cube2 = new Cube(3, 5, 6);
		
		System.out.println(cube2.getCubeVolume());
	}
}
