package com.lti.demos;


public class Calculator {
	
	public String sayHello()
	{
		return "hello world";
	}
	
	public int addNos(int x, int y)
	{
		int result=x+y;
		return result;
	}

	// data type , no of data type , sequence --has to be same 
	
	public int subNos(int x, int y)
	{
		int result=x-y;
		return result;
	}
	
	public void searchEmpId(int empid)
	{
		if(empid==0)
		{
			throw new ArithmeticException("u enetered zero");
		}
		else
		{
			System.out.println(" do something");
		}
		
	}
}

