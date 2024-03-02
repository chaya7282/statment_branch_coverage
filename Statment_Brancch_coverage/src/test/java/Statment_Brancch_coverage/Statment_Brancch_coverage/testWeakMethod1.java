package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testWeakMethod1{
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void 
		testZerro(){
		 int b=0;
		 int a=1;
		 
		 WeakClass.WeakMethod1(a, b);
		
	 }
	

}
