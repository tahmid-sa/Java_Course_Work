import java.util.LinkedList;
import java.util.ArrayList;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n = (long) 1E7;
		
		ArrayList arrayList = new ArrayList();
		
		long milis = System.currentTimeMillis();
		
		for (int i = 0; i < n; i++) {
			arrayList.add(i);
		}
		System.out.println("insert arrayList takes " + System.currentTimeMillis());
		
		LinkedList linkedList = new LinkedList();
		
		milis = System.currentTimeMillis();
		
		for (int i = 0; i < n; i++) {
			linkedList.add(i);
		}
		
		System.out.println("insert linked list takes " + System.currentTimeMillis());
		
		milis = System.currentTimeMillis();
		arrayList.remove(0);
		System.out.println("del front arrayList takes " + System.currentTimeMillis());
	}

}
