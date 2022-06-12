import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> name = new HashSet<String>();
		name.add("Mark");
		name.add("Mar");
		name.add("Ma");
		name.add("M");
		name.add("Markie");
		
		name.clear();
		
		Iterator<String> itr = name.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.previous());
		}
	}

}
