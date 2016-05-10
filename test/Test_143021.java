/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import junit.framework.TestCase;

/**
 *
 * @author 143021
 */
public class Test extends TestCase {
    
    public Test(String testName) {
        super(testName);
    }

    /**
     * Test of BubbleSort method, of class SI_JUNIT.
     */
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        assertEquals(new int[] {}, SI_JUNIT.BubbleSort(new int[] {}));
        assertEquals(new int[] {1,2}, SI_JUNIT.BubbleSort(new int[] {2,1}));
        assertEquals(new int[] {1,2,3}, SI_JUNIT.BubbleSort(new int[] {2,1,3}));
        
    }

    /**
     * Test of eParenTricifren method, of class SI_JUNIT.
     */
    public void testEParenTricifren() {
        System.out.println("ParenTricifren");
        assertTrue(SI_JUNIT.eParenTricifren(426));
        assertTrue(SI_JUNIT.eParenTricifren(135));
        assertTrue(SI_JUNIT.eParenTricifren(123));
        assertFalse(SI_JUNIT.eParenTricifren(346));
    }
}
