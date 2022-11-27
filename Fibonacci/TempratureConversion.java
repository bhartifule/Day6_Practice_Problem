package com.Fibonacci;

import java.util.Scanner;

public class TempratureConversion {
	public static void main(String[] args) 
	  {
		  Scanner sc = new Scanner(System.in);
		  boolean flag=true;
		  String in;
		  System.out.println("Enter the tempareture which do you want to convert into celsius to fahrenheit");
		  in=sc.next();
		  while(flag)
		  {
			  if(TempratureConversion.isNumber(in))
			  {
				  flag=false;
			  }
			  else
			  {
				  System.out.println("Enter the Correct type of tempareture");
				  in=sc.next();
			  }
		  } 
			  double temp=Double.parseDouble(in);
			  System.out.println("Fahrenheit Temp:"+TempratureConversion.celsiusToFahrenheit(temp));
			  
			  boolean flag1=true;
			  String in1;
			  System.out.println("Enter the tempareture which do you want to convert into fahrenheit to celsius");
			  in1=sc.next();
			  while(flag1)
			  {
				  if(TempratureConversion.isNumber(in1))
				  {
					  flag1=false;
				  }
				  else
				  {
					  System.out.println("Enter the Correct type of tempareture");
					  in1=sc.next();
				  }
			  } 
				  double temp1=Double.parseDouble(in1);
				  System.out.println("ceslsius Temp:"+TempratureConversion.fahrenheitToCelsius(temp1));
		  }

	private static String fahrenheitToCelsius(double temp1) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String celsiusToFahrenheit(double temp) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean isNumber(String in) {
		// TODO Auto-generated method stub
		return false;
	
	  }
}
