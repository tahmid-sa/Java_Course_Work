import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {
			File file = new File("fileName1.txt");
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			PrintWriter pw = new PrintWriter(file);
			pw.println("this is my file content");
			pw.println(10000);
			
			pw.close();
			
			System.out.println("Done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

}
