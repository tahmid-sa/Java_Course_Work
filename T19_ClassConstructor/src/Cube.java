
public class Cube {
	int length, bredth, height;
	
	public int getCubeVolume() {
		return (length * bredth * height);
	}
	
	Cube() {
		length = 3;
		bredth = 2;
		height = 4;
		
		System.out.println("We are in a constructor");
	}
	
	Cube(int l, int b, int h) {
		length = l;
		bredth = b;
		height = h;
		
		System.out.println("We are in the 2nd constructor");
	}
}
