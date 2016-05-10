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
		assertEquals(new int[] {0, 1, 2, 3, 4, 5}, obj.BubbleSort(new int[] {5, 3, 1, 2, 0, 4}));
		System.out.println(obj.toString());
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
