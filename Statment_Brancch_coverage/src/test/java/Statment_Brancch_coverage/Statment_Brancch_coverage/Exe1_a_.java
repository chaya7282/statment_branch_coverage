package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exe1_a_ {
	@Test
	public void b_bigger_than_a(){
		 int b=5;
		 int a=4;
		 int expectedResult=5;
		 int result= WeakClass.WeakMethod1(a, b);
		 assertEquals(result, expectedResult,0.001); 
	 }

}
