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
 * @author 133063 Stefan Antoski
 */
public class StefanAntoski133063 {
    
    public StefanAntoski133063() {
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
        int[] num = {0,7,5,2,3};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {0,2,3,5,7};
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
        
        
        int [] num1 = {1,3,5,7,9,11,1,0};
                
               int[] expResult1 = {0,1,1,3,5,7,9,11};
        int[] result1 = instance.BubbleSort(num1);  
        
        assertArrayEquals(expResult1, result1);
        
        
        
          int [] num2 = {1,1,1};
                
               int[] expResult2 = {1,1,1};
        int[] result2 = instance.BubbleSort(num2);  
        
        assertArrayEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of eParenTricifren method, of class SI_JUNIT.
     */
    @Test
    public void testEParenTricifren() {
        System.out.println("eParenTricifren");
        int number = 300;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = true;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
        
         number = 88;
        expResult = false;
        
         result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
        
        
         number =301;
        expResult = false;
        
         result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
