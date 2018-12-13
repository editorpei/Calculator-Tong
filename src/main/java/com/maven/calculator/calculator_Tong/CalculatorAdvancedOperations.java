package com.maven.calculator.calculator_Tong;


	public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface  {
		int OpMode; //5,6,7,8,9,10 equal to  sinx, cos, x2, x3, abs(x),1/x 0 equal NULL
		double a;
		

		public double advFunc(){
			double  result=0;
					switch(OpMode){
					case 5:result=Math.sin(a);	
					/** 
					 * this is sin function
					 */
					break;
					case 6:result=Math.cos(a); 
					/**
					 * this is cos function
					 */
					break;
					case 7:result=a*a;		
					/**
					 * square function
					 */
					break;
					case 8:result=a*a*a;	
					/**
					 * this is cubed function
					 */
					break;
					case 9:result=Math.abs(a);	
					/**
					 * this is  abs function
					 */
					break;
					case 10:             
						/**
						 * this is reciprocal function
						 */
						if(0!=a)
						{result=1/a;			
						break;}
					    
					//default:break;
					
		          }
			
			return result;
		}
			
				
}
