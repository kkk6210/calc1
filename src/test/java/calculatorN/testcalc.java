package calculatorN;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcalc {

	@Test
	public void test() 
	{
		calculatorN cal = new calculatorN();
		cal.add(10,20);
		assertEquals(30,cal.getResult());
		
		fail("Not yet implemented");
	}

}
