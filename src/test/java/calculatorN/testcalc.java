package calculatorN;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcalc {

	@Test
	public void testadd() 
	{
		calculatorN cal = new calculatorN();
		cal.add(10,20);
		assertEquals(30,cal.getResult());
		
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testsub() 
	{
		calculatorN cal = new calculatorN();
		cal.sub(10,20);
		assertEquals(-10,cal.getResult());
		
		
		//fail("Not yet implemented");
	}
	@Test
	public void testdiv() 
	{
		calculatorN cal = new calculatorN();
		cal.div(10,2);
		assertEquals(5,cal.getResult());
		
		
		//fail("Not yet implemented");
	}

}
