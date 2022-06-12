
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student mark = new Student();
		
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(15);
		
		System.out.println(mark.getName() + " is " + mark.getAge());
		
		Student tom = new Student();
		
		tom.setId(1);
		tom.setName("Tom");
		tom.setAge(14);
		
		System.out.println(tom.getName() + " is " + tom.getAge());
	}

}
