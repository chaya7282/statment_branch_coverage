package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testWeakMethod1 {
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void 
		testZerro(){
		 int b=0;
		 int a=1;
		 
		 WeakClass.WeakMethod1(a, b);
		
	 }
	@Test
	public void b_bigger_than_a(){
		 int b=4;
		 int a=4;
		 int expectedResult=1;
		 int result= WeakClass.WeakMethod1(a, b);
		 assertEquals(result, expectedResult,0.001); 
	 }


}
