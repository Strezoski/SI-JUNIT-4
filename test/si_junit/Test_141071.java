import org.junit.Test;

import junit.framework.TestCase;
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;


public class Test_141071 extends TestCase {

	public Test_141071(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	@Test (expected=NoSuchElementException.class)
	public void testOne()throws NoSuchElementException {
		
		int [] num=null;
		/*int []res={1,2,3,4};
		assertEquals(res,SI_JUNIT.BubbleSort(num));*/
		int[]res=SI_JUNIT.BubbleSort(num);
		SI_JUNIT.BubbleSort(res);
		
	}
	@Test
	public void testThree(){
		
		int []res={1,2,3,4,5,6,7,8,9};
		int []input={2,3,4,5,6,1,8,9};
		assertEquals(res,SI_JUNIT.BubbleSort(input));
	}
	
	@Test
	public void testTwo(){
		assertTrue(SI_JUNIT.eParenTricifren(104));
		assertFalse(SI_JUNIT.eParenTricifren(50));
		assertTrue(SI_JUNIT.eParenTricifren(106));
		assertFalse(SI_JUNIT.eParenTricifren(5000));
		assertTrue(SI_JUNIT.eParenTricifren(204));
		assertFalse(SI_JUNIT.eParenTricifren(101));
		assertFalse(SI_JUNIT.eParenTricifren(777));
		assertTrue(SI_JUNIT.eParenTricifren(988));
		assertFalse(SI_JUNIT.eParenTricifren(501));
		assertTrue(SI_JUNIT.eParenTricifren(998));
	}
	

}
