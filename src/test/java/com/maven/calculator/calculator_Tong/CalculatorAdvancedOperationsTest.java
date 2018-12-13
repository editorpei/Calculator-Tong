package com.maven.calculator.calculator_Tong;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorAdvancedOperationsTest {
	CalculatorAdvancedOperations m= new CalculatorAdvancedOperations();
	Random random = new Random();
	double Amp=Double.MAX_VALUE;
	public static final Logger LOG= Logger.getLogger(CalculatorBasicOperations.class.getName());

	

	@Test
	public void test() {
		double result;
		
		m.OpMode= 5;
		for (int i = 0; i < 50; i++) {
			
		
		m.a=random.nextDouble()*Amp;
		result= Math.sin(m.a);
		LOG.info("Testing the method sin()");
		assertEquals(m.advFunc(),result,0);
		
		m.a=-random.nextDouble()*Amp;
		result= Math.sin(m.a);
		LOG.info("Testing the method sin()");
		assertEquals(m.advFunc(),result,0);
		}
		
		 m.a= 0.0;
		 result=Math.sin(m.a);
		 LOG.info("Testing the method sin()");
		 assertEquals(m.advFunc(),result,0);
		 
		 
	}
      @Test
      public void test2(){
    	  double result;
    	  m.OpMode= 6;
    	  for (int i = 0; i < 50; i++) {
			
		
    	  m.a=random.nextDouble()*Amp;
  		  result = Math.cos(m.a);
  		  LOG.info("Testing the method cos()");
  		  assertEquals(m.advFunc(),result,0);
  		
  		  m.a=-random.nextDouble()*Amp;
  		  result= Math.cos(m.a);
  		  LOG.info("Testing the method cos()");
  		  assertEquals(m.advFunc(),result,0);
  		  }

  		
  		  m.a= 0.0;
  		  result=Math.cos(m.a);
  		  LOG.info("Testing the method cos()");
  		  assertEquals(m.advFunc(),result,0);
  		  
      }
      
      @Test
      public void test3(){
    	  double result;
    	  
    	  m.OpMode= 7;
    	  for (int i = 0; i < 50; i++) {
			
		
      
	      m.a=random.nextDouble()*Math.sqrt(Amp);
		  result = m.a*m.a;
		  LOG.info("Testing the method square");
		  assertEquals(m.advFunc(),result,0);
		
		  m.a=-random.nextDouble()*Math.sqrt(Amp);
		  result= m.a*m.a;
		  LOG.info("Testing the method square");
		  assertEquals(m.advFunc(),result,0);
    	  }
		
		  m.a= 0.0;
		  result=m.a*m.a;
		  LOG.info("Testing the method square");
		  assertEquals(m.advFunc(),result,0);
    	  
      }
      @Test
      public void test4(){
    	  m.OpMode= 8;
    	  double result;
    	  for (int i = 0; i <50; i++) {
			
		
      
	      m.a=random.nextDouble()*Math.pow(Amp, 1.0/3);
		  result = m.a*m.a*m.a;
		  LOG.info("Testing the method cubed");
		  assertEquals(m.advFunc(),result,0);
		
		  m.a=-random.nextDouble()*Math.pow(Amp, 1.0/3);
		  result= m.a*m.a*m.a;
		  LOG.info("Testing the method cubed");
		  assertEquals(m.advFunc(),result,0);
    	  }
		
		  m.a= 0.0;
		  result=m.a*m.a*m.a;
		  LOG.info("Testing the method cubed");
		  assertEquals(m.advFunc(),result,0);
}
      @Test
      public void test5(){
    	  m.OpMode= 9;
    	  double result;
    	  for (int i = 0; i < 50; i++) {
			
		
      
	      m.a=random.nextDouble()*Amp;
		  result = Math.abs(m.a);
		  LOG.info("Testing the method abs");
		  assertEquals(m.advFunc(),result,0);
		
		  m.a=-random.nextDouble()*Amp;
		  result= Math.abs(m.a);
		  LOG.info("Testing the method abs");
		  assertEquals(m.advFunc(),result,0);
    	  }
		
		  m.a= 0.0;
		  result=Math.abs(m.a);
		  LOG.info("Testing the method abs");
		  assertEquals(m.advFunc(),result,0);
}
      @Test
      public void test10(){
    	  double result;
    	  m.OpMode= 10;
    	  for (int i = 0; i < 50; i++) {
			
	
    	  
    	  m.a=random.nextDouble()*Amp;
      
	      if (m.a!=0)
		  { result = 1/m.a;
		  LOG.info("Testing the method reciprocal");
		  assertEquals(m.advFunc(),result,0);
		  }
		
		  m.a=-random.nextDouble()*Amp;
		  if(m.a!=0){
		  result= 1/m.a;
		  LOG.info("Testing the method reciprocal");
		  assertEquals(m.advFunc(),result,0);
		  }
		
    	  }
}
}