import java.util.ArrayList;
import java.util.ListIterator;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Mark");
		names.add("Tok");
		names.add("Tom");
		names.add("Jack");
		names.add("King");
		
		
		ListIterator<String> itr = names.listIterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("");
		
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		System.out.println("");
	}

}
