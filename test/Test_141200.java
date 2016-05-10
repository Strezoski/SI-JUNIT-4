/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.NoSuchElementException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import si_junit.SI_JUNIT;

/**
 *
 * @author 141200
 */
public class Test_141200Test {
    
    SI_JUNIT junitTest;
    public Test_141200Test() {
    
    }
    
    @Before
    public void setUp() {
        junitTest = new SI_JUNIT();
    }

    /**
     * Test of BubbleSort method, of class SI_JUNIT.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("Test for bubble sort");
        assertEquals(new int[] {1, 2, 3, 4}, junitTest.BubbleSort(new int[] {2, 3, 1, 4}));
        assertEquals(new int[] {5, 4, 3, 2, 1}, junitTest.BubbleSort(new int[] {1, 2, 3, 4, 5}));
    }

    /**
     * Test of eParenTricifren method, of class SI_JUNIT.
     */
    @Test
    public void testEParenTricifren() {
        System.out.println("Test for parenTricifren");
        assertTrue(junitTest.eParenTricifren(324));
        assertTrue(junitTest.eParenTricifren(400));
        assertFalse(junitTest.eParenTricifren(333));
        assertFalse(junitTest.eParenTricifren(2323));
        assertFalse(junitTest.eParenTricifren(23));
    }
}