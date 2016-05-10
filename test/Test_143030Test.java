/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import si_junit.SI_JUNIT;

/**
 *
 * @author 143030
 */
public class Test_143030Test {
    
    public Test_143030Test() {
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
        int[] num = {4,10,2};
        int[] a={2,4,10};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = null;
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(a, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of eParenTricifren method, of class SI_JUNIT.
     */
    @Test
    public void testEParenTricifren() {
        System.out.println("eParenTricifren");
        int number = 0;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = false;
        boolean result = instance.eParenTricifren(number);
        assertEquals(true, instance.eParenTricifren(200));
        assertEquals(false, instance.eParenTricifren(233));
        assertEquals(false, instance.eParenTricifren(20));
        assertEquals(false, instance.eParenTricifren(23));
        assertEquals(false, instance.eParenTricifren(2));
        assertEquals(false, instance.eParenTricifren(237842));
        // TODO review the generated test code and remove the default call to fail.
        
    }
}