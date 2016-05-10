/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author 143041 Aleksandar Arabadjiev
 */
public class JunitTest {
    
    public JunitTest() {
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
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    public void bubbleTest(){
       
        int numbers[] = {0,5,2,6,3};
        SI_JUNIT ins = new SI_JUNIT();
        int[] res = {0,2,3,5,6};
        int[] rezultat = ins.BubbleSort(numbers);
        assertEquals(res,rezultat);
       
    }
    
    public void vtoraTest(){
        int broj = 300;
        boolean nesto = true;
        SI_JUNIT ins = new SI_JUNIT();
        boolean rezultat = ins.eParenTricifren(broj);
        assertEquals(rezultat,nesto);
    }
    
    
}
