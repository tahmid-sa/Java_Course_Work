
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArr = {1, 5, 6, 8, 3};
		
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
		
		for (int i : myArr) {
			System.out.println(i);
		}
	}
}
