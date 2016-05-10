package si_junit;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import si_junit.SI_JUNIT;
import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class TEST_131111 extends TestCase{
	SI_JUNIT bubleSortObject = new SI_JUNIT();
	ArrayList<Integer> arrayList;
	int[] array ;
	int[] testArray;
	public TEST_131111() {
		Random rdm = new Random();
		array= new int[rdm.nextInt(100)];
		for (int i = 0; i < array.length; i++) {
			array[i] = rdm.nextInt(100);
		}
		arrayList = new ArrayList<Integer>();
		for(int i: array)
			arrayList.add(i);
		Collections.sort(arrayList);
		testArray = new int[arrayList.size()];
		int k =0;
		for(Integer i:arrayList)
			testArray[k++] = i;
	}
	public void testOne(){
		assertEquals(false, bubleSortObject.eParenTricifren(99));
	}
	public void testTwo(){
		assertEquals(false, bubleSortObject.eParenTricifren(0));
	}
	public void testThree(){
		assertEquals(false, bubleSortObject.eParenTricifren(-1));
	}
	public void testFour(){
		assertEquals(true, bubleSortObject.eParenTricifren(100));	}
	public void testFive(){
		assertEquals(false, bubleSortObject.eParenTricifren(1000));	}
	public void testSix(){
		assertEquals(false, bubleSortObject.eParenTricifren(-300));	}
	public void testBubleSort1(){
		
		
		assertEquals(printArray(testArray),printArray(bubleSortObject.BubbleSort(array)));
	}
public void testBubleSort2(){		
		assertEquals(testArray.length, bubleSortObject.BubbleSort(array).length);
	}
	
	private String printArray(int[] arr){
		String str =new String();
		for(int i:arr)
			str+=String.format("%d ",i);
		str+="/n";
		return str;
	}
}
