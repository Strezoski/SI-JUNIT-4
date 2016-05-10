/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si_junit;

import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 141156
 */
public class Test_141156 {
    
    public Test_141156() {
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
    @Test (expected = NoSuchElementException.class)
    public void testBubbleSort1() {
        System.out.println("BubbleSort null");
        int[] num = null;
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {1, 2, 3};
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testBubbleSort2() {
        System.out.println("BubbleSort 1 2 3");
        int[] num = {1, 2, 3};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {1, 2, 3};
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testBubbleSort3() {
        System.out.println("BubbleSort 3 2 1");
        int[] num = {3, 2, 1};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {1, 2, 3};
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testBubbleSort4() {
        System.out.println("BubbleSort 2 1 3");
        int[] num = {2, 1, 3};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {1, 2, 3};
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testBubbleSort5() {
        System.out.println("BubbleSort 5 5 1");
        int[] num = {5, 5, 1};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {1, 5, 5};
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of eParenTricifren method, of class SI_JUNIT.
     */
    @Test
    public void testEParenTricifren1() {
        System.out.println("eParenTricifren 0");
        int number = 0;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = false;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEParenTricifren2() {
        System.out.println("eParenTricifren 99");
        int number = 99;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = false;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEParenTricifren3() {
        System.out.println("eParenTricifren 100");
        int number = 100;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = true;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEParenTricifren4() {
        System.out.println("eParenTricifren 500");
        int number = 500;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = true;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEParenTricifren5() {
        System.out.println("eParenTricifren 553");
        int number = 553;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = false;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEParenTricifren6() {
        System.out.println("eParenTricifren 999");
        int number = 999;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = false;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEParenTricifren7() {
        System.out.println("eParenTricifren 1000");
        int number = 1000;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = false;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEParenTricifren8() {
        System.out.println("eParenTricifren");
        int number = 998;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = true;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
    }
    
}
