package ProgrammingKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCatTest {

	@Test
	public void ConCattest() {
		MyJUnitClass junit = new MyJUnitClass();
		
		String result = junit.ConCat("hii", "bii");
		
		assertEquals("hiibii", result);
	}

}
