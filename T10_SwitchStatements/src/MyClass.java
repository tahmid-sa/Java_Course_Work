
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 100;
		
		switch (score) {
		case 100:
		case 90:
			System.out.println("Very good");
			break;
		case 60:
			System.out.println("good");
			break;
		case 40:
			System.out.println("fail");
			break;
		default:
			System.out.println("okay");
			break;
		}
	}

}
