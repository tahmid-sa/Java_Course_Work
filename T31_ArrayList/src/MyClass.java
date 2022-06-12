import java.util.ArrayList;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int simple_array[] = new int[5];
		
		ArrayList<Integer> myList = new ArrayList<Integer>(10);
		
		myList.add(1);
		myList.add(2);
		myList.add(5);
		myList.add(75);
		myList.add(85);
		
		myList.set(0, 100);
		
		for (Integer x : myList) {
			System.out.println(x);
		}
		
		System.out.println(myList.size());
		
		myList.remove(2);
		
		System.out.println(myList.size());
		
		myList.trimToSize();
		
		
		
		myList.clear();
		
		System.out.println(myList.size());
	}

}
