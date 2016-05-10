/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si_junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;
import java.util.*;


/**
 *
 * @author 141098
 */
public class SI_JUNIT_141098 extends TestCase {
    private Random r;
    
    public void testONe() throws Exception {
        SI_JUNIT obj= new SI_JUNIT();
       
       
        assertEquals(new int[] {0, 1, 2,3}, obj.BubbleSort(new int[] {0, 1, 2,3}));
       
    }
    public void testtwo(){
        SI_JUNIT obj = new SI_JUNIT();
        assertFalse(obj.eParenTricifren(0));
        assertTrue(obj.eParenTricifren(100));
                
               
        
    }
        
}
    
   

