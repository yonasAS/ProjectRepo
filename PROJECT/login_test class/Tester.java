package toolsAssignment;



import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Tester {
Login l=new Login();
String c=l.Validation("1235");
String s="1235";
	@Test
	void testValidation() {
		System.out.println("testing is valid");
		assertEquals(s,c);
	}

}
