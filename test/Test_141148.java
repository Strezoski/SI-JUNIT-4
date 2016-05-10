import java.util.NoSuchElementException;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.TestCase;


public class Test_141148 extends TestCase {

	public Test_141148(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testBubbleSort() {
		SI_JUNIT obj = new SI_JUNIT();
		int [] num = {0, 4, 2, 1, 3};
		int [] expected = {0, 1, 2, 3, 4};
		int [] result = obj.BubbleSort(num);
		
		assertEquals(expected, result);
		
	}
	
	
	@Test(expected = NoSuchElementException.class) 
	public void testExceptionBubbleSort () {
		SI_JUNIT obj = new SI_JUNIT();
		int a [] = obj.BubbleSort(null);
	}
	
	@Test
	public void testEParenTricifren() {
		
		SI_JUNIT obj = new SI_JUNIT();
		
		assertFalse(obj.eParenTricifren(0));
		assertTrue(obj.eParenTricifren(200));
		assertFalse(obj.eParenTricifren(201));
		assertTrue(obj.eParenTricifren(100));
		assertTrue(obj.eParenTricifren(998));
		assertFalse(obj.eParenTricifren(1000));
	}

}
