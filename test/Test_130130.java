/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import si_junit.SI_JUNIT;

/**
 *
 * @author 131030
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
        int[] num = {0};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {0};
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void trettestBubbleSort() {
        System.out.println("BubbleSort");
        int[] num = {0,1,2,3,4,5,6,7};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {0,1,2,3,4,5,6,7};
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void cettestBubbleSort() {
        System.out.println("BubbleSort");
        ArrayList<Integer> list = new ArrayList<>();

        int[] num = {5,5,5,5,5,5,0,5,5,6,0};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {0,0,5,5,5,5,5,5,5,5,6};
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
    }
    
    
    @Test
    public void vtorTestBubbleSort() {
        System.out.println("BubbleSort");
        int[] num = {5, 6, 2, 3, 0, 1432214, 55, 0};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {0,0,2,3,5,6,55,1432214};
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
    }
    
    @Test
    public void testEParenTricifrenVtor() {
        System.out.println("eParenTricifren");
        int number = 524;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = true;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testEParenTricifrenTret() {
        System.out.println("eParenTricifren");
        int number = 999;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = false;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEParenTricifrenCet() {
        System.out.println("eParenTricifren");
        int number = 100;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = true;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
    }
}
