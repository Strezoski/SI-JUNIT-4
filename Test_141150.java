/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package si_junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 141150
 */
public class Test_141150 {
    
    public Test_141150() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of BubbleSort method, of class SI_JUNIT.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        int[] num = {10,2,3};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = null;
        int[] result = instance.BubbleSort(num);
        int[] a={2,3,10};
        assertArrayEquals(a, result);
        assertEquals(true,instance.eParenTricifren(200));
        assertEquals(false,instance.eParenTricifren(555));
        // TODO review the generated test code and remove the default call to fail.
      
    }

    
    
}