package com.maven.calculator.calculator_Tong;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorBasicOperationsTest {
	CalculatorBasicOperations m= new CalculatorBasicOperations();
	Random random = new Random();
	double Amp=Double.MAX_VALUE;
	public static final Logger LOG= Logger.getLogger(CalculatorBasicOperations.class.getName());

	@Test
	public void test1() {
		double result;
		m.basicOperationMode = 1;
		for (int i = 0; i < 50; i++) {
			
		
		
		
		
	
			m.a=random.nextDouble()*Amp;
			m.b=random.nextDouble()*Amp;
			result= m.a+m.b;
			LOG.info("Testing the method addition");
			assertEquals(m.basicFunc(),result,0);
			
			m.a=-random.nextDouble()*Amp;
			m.b=-random.nextDouble()*Amp;
			result= m.a+m.b;
			LOG.info("Testing the method addition");
			assertEquals(m.basicFunc(),result,0);
		}
			
			m.a=0.0;
			m.b=0.0;
			result= 0.0+0.0;
			LOG.info("Testing the method addition");
			assertEquals(m.basicFunc(),result,0);
			
			
		}
		
		
	
	
     @Test
     public void test2(){
    	 
        m.basicOperationMode = 2;
        
		double result;
		for (int i = 0; i < 50; i++) {
			
		
		
	
			m.a=random.nextDouble()*Amp;
			m.b=random.nextDouble()*Amp;
			result= m.a-m.b;
			LOG.info("Testing the method substraktion");
			assertEquals(m.basicFunc(),result,0);
			
			m.a=-random.nextDouble()*Amp;
			m.b=-random.nextDouble()*Amp;
			result= m.a-m.b;
			LOG.info("Testing the method substraktion");
			assertEquals(m.basicFunc(),result,0);
		}
			
			m.a=0.0;
			m.b=0.0;
			result= 0.0-0.0;
			LOG.info("Testing the method substraktion");
			assertEquals(m.basicFunc(),result,0);
			
     }
     
		 
     
     @Test
     public void test3(){
    	 
    	 m.basicOperationMode=3;
    	
 		 double result;
 		 for (int i = 0; i < 50; i++) {
			
		
 		
 	
 			m.a=random.nextDouble()*Amp;
 			m.b=random.nextDouble()*Amp;
 			result= m.a*m.b;
 			LOG.info("Testing the method multiplacation");
 			assertEquals(m.basicFunc(),result,0);
 			
 			m.a=-random.nextDouble()*Amp;
 			m.b=-random.nextDouble()*Amp;
 			result= m.a*m.b;
 			LOG.info("Testing the method multiplication");
 			assertEquals(m.basicFunc(),result,0);
 		 }
 			
 			m.a=0.0;
 			m.b=0.0;
 			result= 0.0*0.0;
 			LOG.info("Testing the method multiplacation");
 			assertEquals(m.basicFunc(),result,0);
 			
     }
     @Test
     public void test4(){
    	 m.basicOperationMode=4;
 		 double result;
 		 for (int i = 0; i <50; i++) {
			
		
 		
 	
 			m.a=random.nextDouble()*Amp;
 			m.b=random.nextDouble()*Amp;
 			if (m.b!=0)
 				
 			{result= m.a/m.b;
 			LOG.info("Testing the method devision");
 			assertEquals(m.basicFunc(),result,0);
 			}
 			
 			m.a=-random.nextDouble()*Amp;
 			m.b=-random.nextDouble()*Amp;
 			if (m.b!=0)
 				
 			{result= m.a/m.b;
 			LOG.info("Testing the method devision");
 			assertEquals(m.basicFunc(),result,0);
 			}
 		 }
 			
 			m.a=0.0;
 			m.b=1;
 			result= m.a/m.b;
 			LOG.info("Testing the method devision");
 			assertEquals(m.basicFunc(),result,0);
 			
     
	
}
}