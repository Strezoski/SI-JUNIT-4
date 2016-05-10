/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package si_junit;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert.*;

/**
 *
 * @author 141032
 */
public class test_141032 {

    private SI_JUNIT s;

    public test_141032() {
        s = new SI_JUNIT();
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
        System.out.println("*test_141032 - testBubbleSort()");
        assertArrayEquals(new int[]{}, s.BubbleSort(new int[]{}));
        assertArrayEquals(new int[]{1}, s.BubbleSort(new int[]{1}));
        assertArrayEquals(new int[]{1, 2}, s.BubbleSort(new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 2}, s.BubbleSort(new int[]{2, 1}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, s.BubbleSort(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, s.BubbleSort(new int[]{2, 3, 4, 1}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, s.BubbleSort(new int[]{3, 4, 1, 2}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, s.BubbleSort(new int[]{4, 1, 2, 3}));

        assertArrayEquals(new int[]{-4, 1, 2, 3}, s.BubbleSort(new int[]{-4, 1, 2, 3}));

        assertArrayEquals(new int[]{'a', 'b', 'c'}, s.BubbleSort(new int[]{'b', 'c', 'a'}));

    }

    @Test(expected = NoSuchElementException.class)
    public void testBubbleSortExpected() {
        System.out.println("*test_141032 - testBubbleSortExpected()");
        System.out.println(s.BubbleSort(null));
    }

    @Test(timeout = 100)
    public void testBubbleSortTimeout() {
        System.out.println("*test_141032 - testBubbleSortTimeout()");
        int num[] = new int[1000];
        for (int i = 0; i < 1000; ++i) {
            num[i] = (new Random()).nextInt(100);
        }
        s.BubbleSort(num);
    }

    /**
     * Test of eParenTricifren method, of class SI_JUNIT.
     */
    @Test
    public void testEParenTricifren() {
        System.out.println("*test_141032 - testEParenTricifren()");
        assertTrue(s.eParenTricifren(102));
        assertTrue(s.eParenTricifren(104));
        assertTrue(s.eParenTricifren(106));

        assertFalse(s.eParenTricifren(101));
        assertFalse(s.eParenTricifren(99));
        assertFalse(s.eParenTricifren(98));

        assertFalse(s.eParenTricifren(1000));

        assertFalse(s.eParenTricifren('a'));
        assertFalse(s.eParenTricifren('b'));
        assertFalse(s.eParenTricifren('c'));
        assertFalse(s.eParenTricifren('Z'));

    }
}
