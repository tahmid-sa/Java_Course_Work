
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello h = new Hello();
		Hello.age = 5;
		
		System.out.println(Hello.DoSomething("hii"));
		
		Hello h1 = new Hello();
		
		System.out.println(h.DoSomethingElse("hey"));
		
		System.out.println(Hello.age);
	}

}
