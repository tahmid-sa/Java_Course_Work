import java.util.LinkedList;

public class MyClass {
	public static void main(String args[]) {
		LinkedList<String> name = new LinkedList<String>();
		
		name.add("bobby");
		name.add("by");
		name.add("bobaiya");
		
		name.addFirst("zack");
		name.addLast("tom");
		
		name.add(0, "ele");
		name.remove(1);
		name.set(0, "pat");
		
		System.out.println(name.size());
		
		name.removeLast();
		//name.removeFirst();
		
		for (String x : name) {
			System.out.println(x);
		}
		
		name.clear();
		
		System.out.println(name.size());
	}
}
