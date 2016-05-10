/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 138012
 */
public class SI_JUNITTest {
    
    public SI_JUNITTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of BubbleSort method, of class SI_JUNIT.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        int[] num = {95,94,91,92,93,90};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {90,91,92,93,94,95};
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
        
        
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
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}