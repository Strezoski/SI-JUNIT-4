/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import si_junit.SI_JUNIT;

/**
 *
 * @author 143003
 */
public class Test_br_143003 {
    
    private static SI_JUNIT sijunit;
    
    public Test_br_143003() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        sijunit = new SI_JUNIT();
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
    @Test(expected=NoSuchElementException.class)
    public void testBubbleSort() {
        System.out.println("testBUbbleSort 1 - exception");
        sijunit.BubbleSort(null);
    }
    
    @Test
    public void testBubbleSort2() {
        System.out.println("testBubbleSort 2 - sorting");
        assertTrue(Arrays.equals(sijunit.BubbleSort(new int[] {3, 1, 2}), new int[] {1, 2, 3}));
        assertTrue(Arrays.equals(sijunit.BubbleSort(new int[] {1, 1, 1}), new int[] {1, 1, 1}));
        assertTrue(Arrays.equals(sijunit.BubbleSort(new int[] {2, 3, 1}), new int[] {1, 2, 3}));
        assertTrue(Arrays.equals(sijunit.BubbleSort(new int[] {3, 2, 1}), new int[] {1, 2, 3}));
        assertTrue(Arrays.equals(sijunit.BubbleSort(new int[] {3, 2, 1, 5, 4}), new int[] {1, 2, 3, 4, 5}));
        assertTrue(Arrays.equals(sijunit.BubbleSort(new int[] {-3, -2, 1}), new int[] {-3, -2, 1}));
        assertTrue(Arrays.equals(sijunit.BubbleSort(new int[] {-3, -2, -11}), new int[] {-11, -3, -2}));
    }

    /**
     * Test of eParenTricifren method, of class SI_JUNIT.
     */
    @Test
    public void testEParenTricifren() {
        System.out.println("testEParenTricifren 1 - validnost");
        assertTrue(sijunit.eParenTricifren(100));
        assertTrue(sijunit.eParenTricifren(120));
        assertTrue(sijunit.eParenTricifren(998));
        assertFalse(sijunit.eParenTricifren(90));
        assertFalse(sijunit.eParenTricifren(-1));
        assertFalse(sijunit.eParenTricifren(-120));
        assertFalse(sijunit.eParenTricifren(0));
        assertFalse(sijunit.eParenTricifren(1000));
    }
}