/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
 * @author 132059
 */
public class Test_132059 {
    SI_JUNIT object;
    public Test_132059() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        object = new SI_JUNIT();
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test(expected = NoSuchElementException.class)
    public void BubbleSortPrazna() {
        object.BubbleSort(null);
    }
    @Test
    public void BubbleSortPravilno() {
        int [] sortirana = new int[3];
        int [] a = new int [3];
        a[0]=3;
        a[1]=1;
        a[2]=2;
        sortirana[0]=1;
        sortirana[1]=2;
        sortirana[2]=3;
        assertArrayEquals (sortirana, object.BubbleSort(a));
        object.BubbleSort(null);
    }
}